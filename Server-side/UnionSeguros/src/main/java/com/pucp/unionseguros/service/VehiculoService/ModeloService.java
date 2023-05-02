package com.pucp.unionseguros.service.VehiculoService;

import com.pucp.unionseguros.model.Vehiculo.Modelo;
import com.pucp.unionseguros.repository.VehiculoRepository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ModeloService {

    private  final ModeloRepository modeloRepository;

    @Autowired
    public ModeloService(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    public List<Modelo> listarModelo(){
        return modeloRepository.findAll();
    }
    public List<Modelo> listarModelosPorMarcas(Integer idMarca){
        return modeloRepository.findModelosByFidMarcaVehiculo(idMarca);
    }

    public void insertarModelo(Modelo modelo){
        modeloRepository.save(modelo);
    }

}
