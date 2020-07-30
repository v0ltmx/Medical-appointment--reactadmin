package projeto3.projetou3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto3.projetou3.modelos.Médico;
import projeto3.projetou3.modelos.Paciente;
import projeto3.projetou3.repositorios.medicoRepository;
import projeto3.projetou3.repositorios.pacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceMedico {

    private medicoRepository repository;



    @Autowired
    public void setRepository(medicoRepository repository) {
        this.repository = repository;
    }


    public Médico insert(Médico m){
        return repository.save(m);
    }

    public Médico update(Médico m){
        return repository.save(m);
    }

    public void delete(Médico m){
        repository.delete(m);
    }

    public Médico getOne(Long id){
        return repository.getOne(id);
    }

    public List<Médico> getAll(){
        return repository.findAll();
    }

    public Médico saveAndFlush(Médico medico){
        return repository.saveAndFlush(medico);
    }


    public Optional<Médico> findById(Long id) { return repository.findById(id); }




}
