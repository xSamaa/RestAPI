package com.reflex.reflexgame.rest;

import com.reflex.reflexgame.dao.PersonasDAO;
import com.reflex.reflexgame.model.Personas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personas")
public class PersonasRest {

    @Autowired
    private PersonasDAO personasDAO;

    // GET, POST, PUT, DELETE -> 200bien-500 lógica mal-404 errores de ruta

    @PostMapping("/guardar")
    public void guardar(@RequestBody Personas persona){
        personasDAO.save(persona);
    }
    @GetMapping("/listar")
    public List<Personas> listar(){
        return personasDAO.findAll();
    }

    @DeleteMapping("/eliminar")
    public void eliminar(){

    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Personas persona){
        personasDAO.save(persona);
    }
}
