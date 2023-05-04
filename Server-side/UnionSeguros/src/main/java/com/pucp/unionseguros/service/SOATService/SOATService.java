package com.pucp.unionseguros.service.SOATService;

import com.pucp.unionseguros.model.SOAT.SOAT;
import com.pucp.unionseguros.repository.SOATRepository.SOATRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SOATService {
    private final SOATRepository soatRepository;

    @Autowired
    public SOATService(SOATRepository soatRepository) {
        this.soatRepository = soatRepository;
    }

    public List<SOAT> listarSOAT(){return  soatRepository.findAll();}

    public void insertarSOAT(SOAT soat) {
        soatRepository.save(soat);
    }
}
