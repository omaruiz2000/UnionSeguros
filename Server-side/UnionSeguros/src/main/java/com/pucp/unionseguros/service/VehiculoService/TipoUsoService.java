package com.pucp.unionseguros.service.VehiculoService;

import com.pucp.unionseguros.model.Vehiculo.TipoUso;
import com.pucp.unionseguros.repository.VehiculoRepository.TipoUsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class TipoUsoService {

    private final TipoUsoRepository tipoUsoRepository;

    @Autowired
    public TipoUsoService(TipoUsoRepository tipoUsoRepository) {
        this.tipoUsoRepository = tipoUsoRepository;
    }

    public List<TipoUso> listarTipoUso(){
        return tipoUsoRepository.findAll();
    }

    public void insertarTipoUso(TipoUso tipoUso){
        tipoUsoRepository.save(tipoUso);
    }
}
