package com.pucp.unionseguros.service.PersonasService;

import com.pucp.unionseguros.model.Personas.TipoDocumento;
import com.pucp.unionseguros.repository.PersonasRepository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TipoDocumentoService {
    private final TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    public TipoDocumentoService(TipoDocumentoRepository tipoDocumentoRepository) {
        this.tipoDocumentoRepository = tipoDocumentoRepository;
    }

    public List<TipoDocumento> listarTipoDocumentos(){
        return tipoDocumentoRepository.findAll();
    }

    public void insertarTipoDocumento(TipoDocumento tipoDocumento){
        tipoDocumentoRepository.save(tipoDocumento);
    }

    public List<TipoDocumento> listarTipoDocumentoActivos(){
        List<TipoDocumento> lista = new ArrayList<>();
        lista = tipoDocumentoRepository.findTipoDocumentoByActivoIsTrue();
        return lista;
    }
}
