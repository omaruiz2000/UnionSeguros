package com.pucp.unionseguros.service.PersonasService;

import com.pucp.unionseguros.model.Personas.Persona;
import com.pucp.unionseguros.repository.PersonasRepository.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonaService {
    final private PersonasRepository personasRepository;

    @Autowired
    public PersonaService(PersonasRepository personasRepository) {
        this.personasRepository = personasRepository;
    }
    public List<Persona> listarPersona(){
        return personasRepository.findAll();
    }
}
