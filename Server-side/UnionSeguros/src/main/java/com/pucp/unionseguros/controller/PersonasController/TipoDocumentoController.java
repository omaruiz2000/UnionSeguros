package com.pucp.unionseguros.controller.PersonasController;

import com.pucp.unionseguros.model.Personas.TipoDocumento;
import com.pucp.unionseguros.repository.PersonasRepository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TipoDocumentoController {


    @Autowired
    TipoDocumentoRepository tipoDocumentoRepository;
    @GetMapping("/test")
    public String prueba(){

        TipoDocumento tipoDocumento = new TipoDocumento(2,"CARNETDEEXTRANJERIA",true);
        tipoDocumento= tipoDocumentoRepository.save(tipoDocumento);
        TipoDocumento tipoDocumento1 = new TipoDocumento(3,"PASAPORTE",true);
        tipoDocumento1= tipoDocumentoRepository.save(tipoDocumento1);
        return "Algo";
    }

    public void prueba2(){


    }
}
