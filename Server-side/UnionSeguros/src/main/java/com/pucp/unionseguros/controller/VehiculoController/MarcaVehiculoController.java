/*
Nombre del archivo:    MarcaVehiculoController
Autor:                Tadeo Gallegos
Descripcion:        Archivo controller de la clase Marca
*/

package com.pucp.unionseguros.controller.VehiculoController;

import com.pucp.unionseguros.model.Vehiculo.MarcaVehiculo;
import com.pucp.unionseguros.service.VehiculoService.MarcaVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/marcaVehiculo")
public class MarcaVehiculoController {

    private final MarcaVehiculoService marcaVehiculoService;

    @Autowired
    public MarcaVehiculoController(MarcaVehiculoService marcaVehiculoService) {
        this.marcaVehiculoService = marcaVehiculoService;
    }

    @GetMapping("/listarTodas")
    public List<MarcaVehiculo> getMarcaVehiculo(){
        return marcaVehiculoService.listarMarcaVehiculo();
    }

    @PostMapping("/insertar")
    public void insertarNuevoMarcaVehiculo(@RequestBody MarcaVehiculo marcaVehiculo){
        marcaVehiculoService.insertarMarcaVehiculo(marcaVehiculo);
    }

    @GetMapping(params = "idMarca",path = "/buscarPorId")
    public MarcaVehiculo buscarMarcaVehiculo(@RequestParam Integer idMarca){
        return marcaVehiculoService.buscarMarcaConElId(idMarca);
    }
}
