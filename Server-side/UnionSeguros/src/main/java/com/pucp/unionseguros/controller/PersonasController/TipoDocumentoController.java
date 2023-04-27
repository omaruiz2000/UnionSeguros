package com.pucp.unionseguros.controller.PersonasController;

import com.pucp.unionseguros.model.Personas.TipoDocumento;
import com.pucp.unionseguros.service.PersonasService.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/tipoDocumento")
public class TipoDocumentoController {

    private final TipoDocumentoService tipoDocumentoService;

    @Autowired
    public TipoDocumentoController(TipoDocumentoService tipoDocumentoService) {
        this.tipoDocumentoService = tipoDocumentoService;
    }


    @GetMapping
    public List<TipoDocumento> getTiposDocumentos(){
        return tipoDocumentoService.listarTipoDocumentos();
    }
}
