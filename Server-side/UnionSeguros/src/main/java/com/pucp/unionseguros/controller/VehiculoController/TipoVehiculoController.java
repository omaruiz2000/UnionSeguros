/*
Nombre del archivo:    TipoVehiculoController
Autor:                Andrea Mejia
Descripcion:        Archivo controller de la clase Tipo Vehiculo
*/

package com.pucp.unionseguros.controller.VehiculoController;

import com.pucp.unionseguros.model.Vehiculo.TipoUso;
import com.pucp.unionseguros.model.Vehiculo.TipoVehiculo;
import com.pucp.unionseguros.service.VehiculoService.TipoVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/tipoVehiculo")
public class TipoVehiculoController {

    private final TipoVehiculoService tipoVehiculoService;

    @Autowired
    public TipoVehiculoController(TipoVehiculoService tipoVehiculoService) {
        this.tipoVehiculoService = tipoVehiculoService;
    }

    @GetMapping("/listarTodos")
    public List<TipoVehiculo> getTipoVehiculos(){
        return tipoVehiculoService.listarTipoVehiculos();
    }

    @PostMapping("/insertar")
    public void registrarNuevoTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo){
        tipoVehiculoService.insertarTipoVehiculo(tipoVehiculo);
    }

}
