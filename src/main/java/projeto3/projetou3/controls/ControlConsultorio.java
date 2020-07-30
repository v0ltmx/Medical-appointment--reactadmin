package projeto3.projetou3.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto3.projetou3.modelos.Consultorio;
import projeto3.projetou3.modelos.Médico;
import projeto3.projetou3.modelos.Paciente;
import projeto3.projetou3.services.ServiceConsultorio;
import projeto3.projetou3.services.ServiceMedico;
import projeto3.projetou3.services.ServicePaciente;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consulta")
@CrossOrigin(origins = {"http://localhost:3000"}, exposedHeaders = "X-Total-Count")
public class ControlConsultorio {

        private ServiceConsultorio service;

        public ControlConsultorio(ServiceConsultorio service){
        this.service = service;
    }


        @GetMapping
        public List<Consultorio> listAll() {

            return service.getAll();
        }

    @GetMapping(path = { "/{id}" })
    public ResponseEntity<Consultorio> getOne(@PathVariable Long id) {
        return service.findById(id).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Consultorio insert(@RequestBody Consultorio c){
        return service.insert(c);

    }

    @PutMapping(path = { "/{id}" })
    public ResponseEntity<Consultorio> update(@PathVariable Long id,
                                           @RequestBody Consultorio consultorio) {
        return service.findById(id).map(record -> {
            service.saveAndFlush(consultorio);
            return ResponseEntity.ok().body(consultorio);
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

