/*
Nombre del archivo:    PermisosController
Autor:                Jarumy Novoa
Descripcion:        Archivo controller de la clase Permisos
*/
package com.pucp.unionseguros.controller.PersonasController;

import com.pucp.unionseguros.model.Personas.Permisos;
import com.pucp.unionseguros.service.PersonasService.PermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/permisos")
public class PermisosController {
    final private PermisosService permisosService;

    @Autowired
    public PermisosController(PermisosService permisosService) {
        this.permisosService = permisosService;
    }

    @GetMapping("/listarTodos")
    public List<Permisos> listarTodosPermisos(){
        return permisosService.listarPermisos();
    }

    @GetMapping("listarActivos")
    public List<Permisos> listarPermisosActivos(){
        return permisosService.listarPermisosActivos();
    }

    @PostMapping("/insertar")
    public Permisos insertarNuevoPermiso(@RequestBody Permisos permisos){
        return permisosService.insertarPermisos(permisos);
    }

    @PutMapping("/modificar")
    public Permisos modificarPermiso(@RequestBody Permisos permisos){
        return permisosService.updatePermisos(permisos);
    }

    @PutMapping("/eliminar")
    public Permisos eliminarPermiso(@RequestBody Permisos permisos){
        return permisosService.deletePermisos(permisos);
    }
}
