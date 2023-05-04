/*
Nombre del archivo:    TipoDocumentoController
Autor:                Andrea Mejia
Descripcion:        Archivo controller de la clase Tipo Documento
*/

package com.pucp.unionseguros.controller.PersonasController;

import com.pucp.unionseguros.model.Personas.TipoDocumento;
import com.pucp.unionseguros.service.PersonasService.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/listarTodos")
    public List<TipoDocumento> listarTiposDocumentos(){
        return tipoDocumentoService.listarTipoDocumentos();
    }

    @GetMapping("/listarActivos")
    public  List<TipoDocumento> listarTiposDocumentosActivos(){
        return  tipoDocumentoService.listarTipoDocumentoActivos();
    }

    @PostMapping("/insertar")
    public void insertarNuevoTipoDocumento(@RequestBody TipoDocumento tipoDocumento){
        tipoDocumentoService.insertarTipoDocumento(tipoDocumento);
    }

}
