package com.pucp.unionseguros.controller.VehiculoController;

import com.pucp.unionseguros.model.Vehiculo.MarcaVehiculo;
import com.pucp.unionseguros.service.VehiculoService.MarcaVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public List<MarcaVehiculo> getMarcaVehiculo(){
        return marcaVehiculoService.listarMarcaVehiculo();
    }
}
