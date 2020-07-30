package projeto3.projetou3.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto3.projetou3.modelos.Paciente;

import java.util.Optional;

public interface pacienteRepository extends JpaRepository<Paciente, Long> {
  /*
    @Override
    Optional<Paciente> findById(Long id);*/
}
