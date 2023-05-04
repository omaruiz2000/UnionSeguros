/*
Nombre del archivo:    CotizacionController
Autor:                Sergio Dadic
Descripcion:        Archivo controller de la clase Cotizacion
*/
package com.pucp.unionseguros.controller.CotizacionController;

import com.pucp.unionseguros.model.Cotizacion.Cotizacion;
import com.pucp.unionseguros.service.CotizacionService.CotizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RequestMapping(path = "api/v1/cotizacion")
public class CotizacionController {

    private final CotizacionService cotizacionService;

    @Autowired
    public CotizacionController(CotizacionService cotizacionService) {
        this.cotizacionService = cotizacionService;
    }

    @GetMapping
    public List<Cotizacion> getCotizaciones(){
        return  cotizacionService.listarCotizacion();
    }
}
