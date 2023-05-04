/*
Nombre del archivo:    BoletaDeVentaController
Autor:                Sergio Dadic
Descripcion:        Archivo controller de la clase Boleta de Venta
*/

package com.pucp.unionseguros.controller.SOATController;

import com.pucp.unionseguros.model.SOAT.BoletaDeVenta;
import com.pucp.unionseguros.service.SOATService.BoletaDeVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/BoletaDeVenta")
public class BoletaDeVentaController {
    private  final BoletaDeVentaService boletaDeVentaService;

    @Autowired
    public BoletaDeVentaController(BoletaDeVentaService boletaDeVentaService) {
        this.boletaDeVentaService = boletaDeVentaService;
    }

    @GetMapping("/listarTodas")
    public List<BoletaDeVenta> listarBoletasDeVenta(){
        return boletaDeVentaService.listarBoletaDeVenta();
    }

    @GetMapping("/listarActivas")
    public List<BoletaDeVenta> listarBoletasDeVentaActivas(){
        return  boletaDeVentaService.listarBoletasDeVentaActivas();
    }
    @PostMapping("/insertar")
    public void insertarNuevaBoletaDeVenta(@RequestBody BoletaDeVenta boletaDeVenta){
        boletaDeVentaService.insertarBoletaDeVenta(boletaDeVenta);
    }

}
