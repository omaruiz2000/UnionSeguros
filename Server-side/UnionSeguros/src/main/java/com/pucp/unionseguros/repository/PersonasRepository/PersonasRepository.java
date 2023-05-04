package com.pucp.unionseguros.repository.PersonasRepository;

import com.pucp.unionseguros.model.Personas.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonasRepository extends JpaRepository<Persona,Integer> {
}
