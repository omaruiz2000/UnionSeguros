package com.pucp.unionseguros.controller.SOATController;

import com.pucp.unionseguros.model.SOAT.Cobertura;
import com.pucp.unionseguros.service.SOATService.CoberturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/Cobertura")
public class CoberturaController {
    private final CoberturaService coberturaService;

    @Autowired
    public CoberturaController(CoberturaService coberturaService) {
        this.coberturaService = coberturaService;
    }

    @GetMapping()
    public List<Cobertura> listarCobertura(){
        return coberturaService.listarCobertura();
    }

    @PostMapping()
    public void insertarNuevaCobertura(@RequestBody Cobertura cobertura){
        coberturaService.insertarCobertura(cobertura);
    }
}
