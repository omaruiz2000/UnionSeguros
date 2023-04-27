package com.pucp.unionseguros.controller.VehiculoController;

import com.pucp.unionseguros.model.Vehiculo.Vehiculo;
import com.pucp.unionseguros.service.VehiculoService.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/vehiculo")
public class VehiculoController {
    private final VehiculoService vehiculoService;

    @Autowired
    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }


    @GetMapping()
    public List<Vehiculo> getVehiculos(){
        return vehiculoService.listarVehiculos();
    }

    @PostMapping
    public void registrarNuevoVehiculo(@RequestBody Vehiculo vehiculo){
        vehiculoService.insertarVehiculo(vehiculo);
    }


}
