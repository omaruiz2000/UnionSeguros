/*
Nombre del archivo:    DepartamentoController
Autor:                Tadeo Gallegos
Descripcion:        Archivo controller de la clase Departamento
*/

package com.pucp.unionseguros.controller.DistritosController;

import com.pucp.unionseguros.model.Distritos.Departamento;
import com.pucp.unionseguros.model.Personas.TipoDocumento;
import com.pucp.unionseguros.repository.DistritosRepository.DepartamentoRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service

@RequestMapping(path = "api/v1/Departamento")
public class DepartamentoController {
    @Autowired
    DepartamentoRepository departamentoRepository;

    @GetMapping()
    public List<Departamento> listarDepartamentos(){
        return departamentoRepository.findAll();
    }


}
