package projeto3.projetou3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import projeto3.projetou3.modelos.Consultorio;
import projeto3.projetou3.modelos.Paciente;
import projeto3.projetou3.repositorios.pacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePaciente {

        private pacienteRepository repository;

    @Autowired
    public void setRepository(pacienteRepository repository) {
        this.repository = repository;
    }

    public Paciente insert(Paciente p){
            return repository.save(p);
    }

    public Paciente update(Paciente p){
            return repository.save(p);
    }

    public void delete(Paciente p){
        repository.delete(p);
    }


    @GetMapping(path = {"/{id}"})
    public Paciente getOne(Long id){

            return repository.findById(id).orElse(null);
    }



    public List<Paciente> getAll(){
            return repository.findAll();
    }


    public Paciente saveAndFlush(Paciente paciente){
        return repository.saveAndFlush(paciente);
    }


    public Optional<Paciente> findById(Long id) { return repository.findById(id); }

    public Paciente save(Paciente paciente) { return repository.save(paciente); }



}
