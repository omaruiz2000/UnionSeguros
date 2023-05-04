package com.pucp.unionseguros.service.PersonasService;

import com.pucp.unionseguros.model.Personas.Roles;
import com.pucp.unionseguros.repository.PersonasRepository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
import java.util.List;

@Component
public class RolesService {

    final private RolesRepository rolesRepository;

    @Autowired
    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public List<Roles> listarRoles(){
        return rolesRepository.findAll();
    }

    public List<Roles> ListarRolesActivos(){
        return  rolesRepository.findRolesByActivoIsTrue();
    }

    public Roles insertarRol(Roles roles){
        return  rolesRepository.save(roles);
    }



}
