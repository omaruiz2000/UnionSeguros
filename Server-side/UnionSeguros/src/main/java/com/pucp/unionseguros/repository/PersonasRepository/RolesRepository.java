package com.pucp.unionseguros.repository.PersonasRepository;

import com.pucp.unionseguros.model.Personas.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Integer> {
    public List<Roles> findRolesByActivoIsTrue();

    public Roles findRolesByIdRoleAndActivoIsTrue(Integer idRol);
}
