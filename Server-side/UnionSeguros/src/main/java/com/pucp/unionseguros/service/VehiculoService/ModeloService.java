package com.pucp.unionseguros.service.VehiculoService;

import com.pucp.unionseguros.model.Vehiculo.MarcaVehiculo;
import com.pucp.unionseguros.model.Vehiculo.Modelo;
import com.pucp.unionseguros.model.Vehiculo.Vehiculo;
import com.pucp.unionseguros.repository.VehiculoRepository.MarcaVehiculoRepository;
import com.pucp.unionseguros.repository.VehiculoRepository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ModeloService {

    private  final ModeloRepository modeloRepository;
    private final MarcaVehiculoRepository marcaVehiculoRepository;

    @Autowired
    public ModeloService(ModeloRepository modeloRepository,
                         MarcaVehiculoRepository marcaVehiculoRepository) {
        this.modeloRepository = modeloRepository;
        this.marcaVehiculoRepository = marcaVehiculoRepository;
    }

    public List<Modelo> listarModelo(){
        return modeloRepository.findAll();
    }
    public List<Modelo> listarModelosPorMarcas(Integer idMarca){
        MarcaVehiculo marcaVehiculo = new MarcaVehiculo();
        marcaVehiculo =  marcaVehiculoRepository.findMarcaVehiculoById(idMarca);
        return modeloRepository.findModelosByFidMarcaVehiculo(marcaVehiculo);
    }

    public void insertarModelo(Modelo modelo){
        modeloRepository.save(modelo);
    }

}
