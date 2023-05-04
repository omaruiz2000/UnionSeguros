/*
Nombre del archivo:    PersonaController
Autor:                Sergio Dadic
Descripcion:        Archivo controller de la clase Persona
*/

package com.pucp.unionseguros.controller.PersonasController;

import com.pucp.unionseguros.model.Personas.Persona;
import com.pucp.unionseguros.service.PersonasService.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/persona")
public class PersonaController {
    final private PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping()
    public List<Persona> listarPersonas(){
        return personaService.listarPersona();
    }
}
