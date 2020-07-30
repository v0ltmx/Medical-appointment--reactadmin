package projeto3.projetou3.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto3.projetou3.modelos.Médico;

import java.util.Optional;

public interface medicoRepository extends JpaRepository<Médico, Long> {
  /*
    @Override
    Optional<Médico> findById(Long id);*/
}
