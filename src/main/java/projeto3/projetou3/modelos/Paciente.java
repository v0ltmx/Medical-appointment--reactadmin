package projeto3.projetou3.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Consultorio> consultorios;


/*
    @ManyToOne
    @JoinColumn(name = "Medico_id")
    Médico medico;
*/

    /*
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "consulta",
            joinColumns = @JoinColumn(name = "paciente_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "medico_id")
    )
    List<Consultorio> consultas;
*/
}
