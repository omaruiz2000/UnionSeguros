package com.pucp.unionseguros.service.CotizacionService;


import com.pucp.unionseguros.model.Cotizacion.Cotizacion;
import com.pucp.unionseguros.repository.CotizacionRepository.CotizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CotizacionService {
    private final CotizacionRepository cotizacionRepository;

    @Autowired
    public CotizacionService(CotizacionRepository cotizacionRepository) {
        this.cotizacionRepository = cotizacionRepository;
    }
    public List<Cotizacion> listarCotizacion(){
        return cotizacionRepository.findAll();
    }
}
