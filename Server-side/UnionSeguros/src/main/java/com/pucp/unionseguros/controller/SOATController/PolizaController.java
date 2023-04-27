package com.pucp.unionseguros.controller.SOATController;

import com.pucp.unionseguros.model.SOAT.Poliza;
import com.pucp.unionseguros.service.SOATService.PolizaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/poliza")
public class PolizaController {
    private final PolizaService polizaService;

    @Autowired
    public PolizaController(PolizaService polizaService) {
        this.polizaService = polizaService;
    }

    @GetMapping()
    public List<Poliza> listarPolizas(){
        return polizaService.listarPoliza();
    }

    @PostMapping
    public void registrarNuevaPoliza(@RequestBody Poliza poliza){
        polizaService.insertarPoliza(poliza);
    }
}
