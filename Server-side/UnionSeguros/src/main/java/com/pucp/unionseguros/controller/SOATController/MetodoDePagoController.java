/*
Nombre del archivo:    MetodoDePagoController
Autor:                Sergio Dadic
Descripcion:        Archivo controller de la clase Metodo De Pago
*/

package com.pucp.unionseguros.controller.SOATController;

import com.pucp.unionseguros.model.SOAT.MetodoDePago;
import com.pucp.unionseguros.service.SOATService.MetodoDePagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/metodoDePago")
public class MetodoDePagoController {

    private final MetodoDePagoService metodoDePagoService;

    @Autowired
    public MetodoDePagoController(MetodoDePagoService metodoDePagoService) {
        this.metodoDePagoService = metodoDePagoService;
    }

    @GetMapping("/listarTodos")
    public List<MetodoDePago> listarMetodoDePagos(){
        return metodoDePagoService.listarMetododePagos();
    }

    @PostMapping("/insertar")
    public void insertarNuevoMetodoDePago(@RequestBody MetodoDePago metodoDePago){
        metodoDePagoService.insertarMetodoDePago(metodoDePago);
    }

}
