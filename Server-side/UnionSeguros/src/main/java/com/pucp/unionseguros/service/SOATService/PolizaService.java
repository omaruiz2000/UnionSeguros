package com.pucp.unionseguros.service.SOATService;

import com.pucp.unionseguros.model.SOAT.Poliza;
import com.pucp.unionseguros.repository.SOATRepository.PolizaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PolizaService {
    private final PolizaRepository polizaRepository;

    @Autowired
    public PolizaService(PolizaRepository polizaRepository) {
        this.polizaRepository = polizaRepository;
    }

    public List<Poliza> listarPoliza(){
        return polizaRepository.findAll();
    }

    public void insertarPoliza(Poliza poliza){
        polizaRepository.save(poliza);
    }
}
