package com.pucp.unionseguros.service.SOATService;

import com.pucp.unionseguros.model.SOAT.BoletaDeVenta;
import com.pucp.unionseguros.model.SOAT.PlanSOAT;
import com.pucp.unionseguros.repository.SOATRepository.BoletaDeVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BoletaDeVentaService {
    private final BoletaDeVentaRepository boletaDeVentaRepository;

    @Autowired
    public BoletaDeVentaService(BoletaDeVentaRepository boletaDeVentaRepository) {
        this.boletaDeVentaRepository = boletaDeVentaRepository;
    }

    public List<BoletaDeVenta> listarBoletaDeVenta(){
        return boletaDeVentaRepository.findAll();
    }

    public  void insertarBoletaDeVenta(BoletaDeVenta boletaDeVenta){
        boletaDeVentaRepository.save(boletaDeVenta);
    }

    public List<BoletaDeVenta> listarBoletasDeVentaActivas(){
        List<BoletaDeVenta> lista = new ArrayList<>();
        lista= boletaDeVentaRepository.findBoletaDeVentaByActivoIsTrue();
        return lista;
    }

//    public BoletaDeVenta updateBoletaDeVenta(BoletaDeVenta boletaDeVenta){
//        BoletaDeVenta foundBoleta = boletaDeVentaRepository.findBoletaDeVentaByIdAndActivoIsTrue(boletaDeVenta.getId());
//        foundBoleta.setId(boletaDeVenta.getId());
//        foundBoleta.setMonto(boletaDeVenta.getMonto());
//        foundBoleta.set
//    }
}
