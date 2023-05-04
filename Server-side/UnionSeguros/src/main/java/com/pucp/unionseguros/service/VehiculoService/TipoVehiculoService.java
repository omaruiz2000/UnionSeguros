package com.pucp.unionseguros.service.VehiculoService;

import com.pucp.unionseguros.model.Vehiculo.TipoUso;
import com.pucp.unionseguros.model.Vehiculo.TipoVehiculo;
import com.pucp.unionseguros.repository.VehiculoRepository.TipoVehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TipoVehiculoService {
    private final TipoVehiculoRepository tipoVehiculoRepository;

    @Autowired
    public TipoVehiculoService(TipoVehiculoRepository tipoVehiculoRepository) {
        this.tipoVehiculoRepository = tipoVehiculoRepository;
    }

    public List<TipoVehiculo> listarTipoVehiculos(){
        return tipoVehiculoRepository.findAll();
    }

    public void insertarTipoVehiculo(TipoVehiculo tipoVehiculo){
        tipoVehiculoRepository.save(tipoVehiculo);
    }
}
