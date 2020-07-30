package projeto3.projetou3.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Médico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    String nome;
    String categoria;
/*
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER ,orphanRemoval = true , mappedBy = "medico")

    List<Consultorio> consultorios;

*/

    /*
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "medico")
    @JoinColumn(name = "consulta_id")
    Consultorio consulta;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "pacientes")
    List<Paciente> pacientes;
*/


}
