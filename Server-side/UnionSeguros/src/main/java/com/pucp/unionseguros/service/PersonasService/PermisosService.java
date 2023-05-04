package com.pucp.unionseguros.service.PersonasService;

import com.pucp.unionseguros.model.Personas.Permisos;
import com.pucp.unionseguros.repository.PersonasRepository.PermisosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PermisosService {
    final private PermisosRepository permisosRepository;

    @Autowired
    public PermisosService(PermisosRepository permisosRepository) {
        this.permisosRepository = permisosRepository;
    }

    public List<Permisos> listarPermisos(){
        List<Permisos> lista= new ArrayList<>();
        lista = permisosRepository.findAll();
        return lista;
    }

    public List<Permisos> listarPermisosActivos(){
        List<Permisos> lista= new ArrayList<>();
        lista = permisosRepository.findPermisosByActivoIsTrue();
        return lista;
    }

    public Permisos insertarPermisos(Permisos permisos){
        return permisosRepository.save(permisos);
    }

    public Permisos updatePermisos(Permisos permisos){
        Permisos foundPermisos = permisosRepository.findPermisosByIdAndActivoIsTrue(permisos.getId());
        foundPermisos.setId(permisos.getId());
        foundPermisos.setActivo(permisos.isActivo());
        foundPermisos.setDescripcion(permisos.getDescripcion());
        return permisosRepository.save(foundPermisos);
    }

    public Permisos deletePermisos(Permisos permisos){
        Permisos foundPermisos = permisosRepository.findPermisosByIdAndActivoIsTrue(permisos.getId());
        foundPermisos.setId(permisos.getId());
        foundPermisos.setActivo(false);
        foundPermisos.setDescripcion(permisos.getDescripcion());
        return permisosRepository.save(foundPermisos);
    }
}
