package projeto3.projetou3.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Consultorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String descricao;


    /*
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="paciente_id")
    Paciente paciente;
*/

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "medico_consultorio",
            joinColumns = @JoinColumn(name = "consultorio_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "medico_id")
    )
    List<Médico> medicos;



/*
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="medico_id")
    Médico medico;
*/



  /*

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    Paciente paciente;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = consultas)
    @JoinTable(
            name = "consulta_id",
            joinColumns = @JoinColumn(name = "consultorio_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "medico_id")
    )
    List<Médico> medicos;
*/

}
