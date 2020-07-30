package projeto3.projetou3.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto3.projetou3.modelos.Médico;
import projeto3.projetou3.modelos.Paciente;
import projeto3.projetou3.services.ServiceMedico;
import projeto3.projetou3.services.ServicePaciente;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paciente")
@CrossOrigin(origins = {"http://localhost:3000"}, exposedHeaders = "X-Total-Count")
public class ControlPaciente {

    private ServicePaciente service;

    public ControlPaciente(ServicePaciente service){
        this.service = service;
    }

    @GetMapping
    public List<Paciente> listAll(){

        return service.getAll();
    }

    @GetMapping(path = { "/{id}" })
    public ResponseEntity<Paciente> getOne(@PathVariable Long id) {
        return service.findById(id).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Paciente insert(@RequestBody Paciente p){
        return service.insert(p);

    }

    @PutMapping(path = { "/{id}" })
    public ResponseEntity<Paciente> update(@PathVariable Long id,
                                           @RequestBody Paciente paciente) {
        return service.findById(id).map(record -> {
            service.saveAndFlush(paciente);
            return ResponseEntity.ok().body(paciente);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return service.findById(id).map(record -> {
            service.delete(record);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }




/*
    @GetMapping(path = {"/{id}"})
    public Optional<Paciente> getOne(@PathVariable Long id){
        return service.findById(id);
    }
*/


  /*
    @PutMapping(path = {"/{id}"})
    public ResponseEntity<Paciente> update(@PathVariable Long id, @RequestBody Paciente p){
        Paciente pacienteatt = ServicePaciente.save(p);
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> delete(@PathVariable Long id){
        Médico medicof = ServiceMedico.getOne(id);
        ServiceMedico.delete(medicof);
    }
*/




}
