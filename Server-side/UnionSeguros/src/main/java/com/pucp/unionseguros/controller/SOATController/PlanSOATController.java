package com.pucp.unionseguros.controller.SOATController;

import com.pucp.unionseguros.model.SOAT.PlanSOAT;
import com.pucp.unionseguros.service.SOATService.PlanSOATService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Tadeo Gallegos
@Service
@RestController
@RequestMapping(path = "api/v1/planSOAT")
public class PlanSOATController {

    private final PlanSOATService planSOATService;

    @Autowired
    public PlanSOATController(PlanSOATService planSOATService) {
        this.planSOATService = planSOATService;
    }

    @GetMapping()
    public List<PlanSOAT> listarPlanSOATs(){
        return planSOATService.listarPlanSOAT();
    }

    @PostMapping()
    public void insetarNuevoPlanSOAT(@RequestBody PlanSOAT planSOAT){
        planSOATService.insertarPlanSOAT(planSOAT);
    }
}
