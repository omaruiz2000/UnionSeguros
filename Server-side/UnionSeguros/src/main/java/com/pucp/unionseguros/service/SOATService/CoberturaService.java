package com.pucp.unionseguros.service.SOATService;

import com.pucp.unionseguros.model.SOAT.Cobertura;
import com.pucp.unionseguros.repository.SOATRepository.CoberturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CoberturaService {
    private final CoberturaRepository coberturaRepository;

    @Autowired
    public CoberturaService(CoberturaRepository coberturaRepository) {
        this.coberturaRepository = coberturaRepository;
    }
    public List<Cobertura> listarCobertura(){
        return coberturaRepository.findAll();
    }

    public void insertarCobertura(Cobertura cobertura){
        coberturaRepository.save(cobertura);
    }
}
