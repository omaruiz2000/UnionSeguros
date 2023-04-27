package com.pucp.unionseguros.service.SOATService;

import com.pucp.unionseguros.model.SOAT.PlanSOAT;
import com.pucp.unionseguros.repository.SOATRepository.PlanSOATRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
