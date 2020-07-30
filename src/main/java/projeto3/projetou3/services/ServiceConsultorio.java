package projeto3.projetou3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto3.projetou3.modelos.Consultorio;
import projeto3.projetou3.modelos.Paciente;
import projeto3.projetou3.repositorios.consultorioRepository;
import projeto3.projetou3.repositorios.pacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceConsultorio {

    private consultorioRepository repository;


    @Autowired
    public void setRepository(consultorioRepository repository) {
        this.repository = repository;
    }


    public Consultorio insert(Consultorio c){
        return repository.save(c);
    }

    public Consultorio update(Consultorio c){
        return repository.save(c);

    }

    public void delete(Consultorio c){
        repository.delete(c);
    }

    public Consultorio getOne(Long id){
        return repository.getOne(id);
    }

    public List<Consultorio> getAll(){
        return repository.findAll();
    }

    public Consultorio saveAndFlush(Consultorio consultorio){
        return repository.saveAndFlush(consultorio);
    }


    public Optional<Consultorio> findById(Long id) { return repository.findById(id); }

    public Consultorio save(Consultorio consultorio) { return repository.save(consultorio); }


}
