/*
Nombre del archivo:    ModeloController
Autor:                Tadeo Gallegos
Descripcion:        Archivo controller de la clase Modelo
*/

package com.pucp.unionseguros.controller.VehiculoController;

import com.pucp.unionseguros.model.Vehiculo.Modelo;
import com.pucp.unionseguros.service.VehiculoService.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/modelo")
public class ModeloController {

    private  final ModeloService modeloService;

    @Autowired
    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

//    @GetMapping
//    public List<Modelo> getModelos(){
//        return modeloService.listarModelo();
//    }

//    @GetMapping(path = "/{idMarca}")
//    public List<Modelo> getModelosByIdMarca(@PathVariable(name = "idMarca") Integer idMarca){
//        return modeloService.listarModelosPorMarcas(idMarca);
//    }

    @GetMapping(params = "idMarca",path = "/listarModelosPorIdMarca")
    public List<Modelo> getModelosByIdMarca(@RequestParam(name = "idMarca") Integer idMarca){
        return modeloService.listarModelosPorMarcas(idMarca);
    }

    @PostMapping("/insertar")
    public  void registrarNuevoModelo(@RequestBody Modelo modelo){
        modeloService.insertarModelo(modelo);
    }
}
