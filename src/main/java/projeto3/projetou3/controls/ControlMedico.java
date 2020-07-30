package projeto3.projetou3.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto3.projetou3.modelos.Médico;
import projeto3.projetou3.modelos.Paciente;
import projeto3.projetou3.services.ServiceMedico;
import projeto3.projetou3.services.ServicePaciente;


import java.security.Provider;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medico")
@CrossOrigin(origins = {"http://localhost:3000"} , exposedHeaders = "X-Total-Count")
public class ControlMedico {

        private ServiceMedico service;

        public ControlMedico(ServiceMedico service){
        this.service = service;
    }

        /*
        @Autowired
        public void setService(ServiceMedico service) {
            this.service = service;
        }
*/
        @GetMapping
        public List<Médico> listAll() {

            return service.getAll();
        }

    @GetMapping(path = { "/{id}" })
    public ResponseEntity<Médico> getOne(@PathVariable Long id) {
        return service.findById(id).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Médico insert(@RequestBody Médico m){
        return service.insert(m);

    }

    @PutMapping(path = { "/{id}" })
    public ResponseEntity<Médico> update(@PathVariable Long id,
                                           @RequestBody Médico medico) {
        return service.findById(id).map(record -> {
            service.saveAndFlush(medico);
            return ResponseEntity.ok().body(medico);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return service.findById(id).map(record -> {
            service.delete(record);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }


    }

