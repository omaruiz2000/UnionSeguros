package com.pucp.unionseguros.service.SOATService;

import com.pucp.unionseguros.model.SOAT.PlanSOAT;
import com.pucp.unionseguros.repository.SOATRepository.PlanSOATRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlanSOATService {
    private final PlanSOATRepository planSOATRepository;

    @Autowired
    public PlanSOATService(PlanSOATRepository planSOATRepository) {
        this.planSOATRepository = planSOATRepository;
    }

    public List<PlanSOAT> listarPlanSOAT(){
        return planSOATRepository.findAll();
    }

    public void insertarPlanSOAT(PlanSOAT planSOAT){
        planSOATRepository.save(planSOAT);
    }

    public List<PlanSOAT> listarPlanSoatActivos(){
        List<PlanSOAT> lista = new ArrayList<>();
        lista=planSOATRepository.findPlanSOATByActivoIsTrue();
        return  lista;
    }
    public PlanSOAT updatePlanSoat(PlanSOAT planSOAT){
        PlanSOAT foundPlanSoat = planSOATRepository.findPlanSOATByIdAndActivoIsTrue(planSOAT.getId());
        foundPlanSoat.setId(planSOAT.getId());
        foundPlanSoat.setNombrePlan(planSOAT.getNombrePlan());
        foundPlanSoat.setPrecio(planSOAT.getPrecio());
        foundPlanSoat.setCobertura(planSOAT.getCobertura());
        foundPlanSoat.setActivo(planSOAT.isActivo());
        return planSOATRepository.save(foundPlanSoat);
    }
    public  PlanSOAT deletePlanSoat(PlanSOAT planSOAT){
        PlanSOAT foundPlanSoat = planSOATRepository.findPlanSOATByIdAndActivoIsTrue(planSOAT.getId());
        foundPlanSoat.setId(planSOAT.getId());
        foundPlanSoat.setNombrePlan(planSOAT.getNombrePlan());
        foundPlanSoat.setPrecio(planSOAT.getPrecio());
        foundPlanSoat.setCobertura(planSOAT.getCobertura());
        foundPlanSoat.setActivo(false);
        return planSOATRepository.save(foundPlanSoat);
    }
}
