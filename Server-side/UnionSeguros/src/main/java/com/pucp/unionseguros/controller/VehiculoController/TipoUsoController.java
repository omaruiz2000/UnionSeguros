package com.pucp.unionseguros.controller.VehiculoController;

import com.pucp.unionseguros.model.Vehiculo.TipoUso;
import com.pucp.unionseguros.service.VehiculoService.TipoUsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/tipoUsoVehiculo")
public class TipoUsoController {

    private final TipoUsoService tipoUsoService;

    @Autowired
    public TipoUsoController(TipoUsoService tipoUsoService) {
        this.tipoUsoService = tipoUsoService;
    }

    @GetMapping
    public List<TipoUso> getTipoUsos(){
       return tipoUsoService.listarTipoUso();
    }
}
