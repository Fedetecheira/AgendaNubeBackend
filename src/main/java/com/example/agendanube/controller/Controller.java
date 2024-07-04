package com.example.agendanube.controller;

import com.example.agendanube.model.Persona;
import com.example.agendanube.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class Controller {

    @Autowired
private Repository repo;


     @GetMapping
    public List<Persona> getPersonas(){
        return repo.findAll();
     }
     @PostMapping
    public String save(@RequestBody Persona persona){
        repo.save(persona);
        return "GRABADO";
     }

     @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody Persona persona){
        Persona updatePersona = repo.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
                updatePersona.setNombre(persona.getNombre());
                updatePersona.setTelefono(persona.getTelefono());
                repo.save(updatePersona);
                return "EDITADO CORRECTAMENTE";
     }

    private void orElseThrow(Object contactNotFound) {
    }

    @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
        Persona deletePersona = repo.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
        repo.delete(deletePersona);
       
}

}
