package com.pucp.unionseguros.service.VehiculoService;

import com.pucp.unionseguros.model.Vehiculo.MarcaVehiculo;
import com.pucp.unionseguros.repository.VehiculoRepository.MarcaVehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MarcaVehiculoService {
    private final MarcaVehiculoRepository marcaVehiculoRepository;

    @Autowired
    public MarcaVehiculoService(MarcaVehiculoRepository marcaVehiculoRepository) {
        this.marcaVehiculoRepository = marcaVehiculoRepository;
    }

    public List<MarcaVehiculo> listarMarcaVehiculo(){
        return marcaVehiculoRepository.findAll();
    }

    public void insertarMarcaVehiculo(MarcaVehiculo marcaVehiculo){
        marcaVehiculoRepository.save(marcaVehiculo);
    }

    public MarcaVehiculo buscarMarcaConElId(Integer idMarca){
        return marcaVehiculoRepository.findMarcaVehiculoById(idMarca);
    }
}
