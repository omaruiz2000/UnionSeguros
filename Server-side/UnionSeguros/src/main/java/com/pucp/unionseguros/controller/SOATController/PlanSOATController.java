/*
Nombre del archivo:    PlanSOATController
Autor:                Tadeo Gallegos
Descripcion:        Archivo controller de la clase Plan SOAT
*/

package com.pucp.unionseguros.controller.SOATController;

import com.pucp.unionseguros.model.SOAT.PlanSOAT;
import com.pucp.unionseguros.service.SOATService.PlanSOATService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service
@RestController
@RequestMapping(path = "api/v1/planSOAT")
public class PlanSOATController {

    private final PlanSOATService planSOATService;

    @Autowired
    public PlanSOATController(PlanSOATService planSOATService) {
        this.planSOATService = planSOATService;
    }

    @GetMapping("/ListarTodos")
    public List<PlanSOAT> listarPlanSOATs(){
        return planSOATService.listarPlanSOAT();
    }

    @GetMapping("/listarActivos")
    public List<PlanSOAT> listarPlanSOACTActivos(){
        return planSOATService.listarPlanSoatActivos();
    }
    @PostMapping("/insertar")
    public void insetarNuevoPlanSOAT(@RequestBody PlanSOAT planSOAT){
        planSOATService.insertarPlanSOAT(planSOAT);
    }

    @PutMapping("/modificar")
    public PlanSOAT modificarPlanSoat(@RequestBody PlanSOAT planSOAT){
        return planSOATService.updatePlanSoat(planSOAT);
    }

    @PutMapping("/eliminar")
    public PlanSOAT eliminarPlanSoat(@RequestBody PlanSOAT planSOAT){
        return planSOATService.deletePlanSoat(planSOAT);
    }

}
