/*
Nombre del archivo:    TipoUsoController
Autor:                Sergio Dadic
Descripcion:        Archivo controller de la clase Tipo Uso
*/

package com.pucp.unionseguros.controller.VehiculoController;

import com.pucp.unionseguros.model.Vehiculo.TipoUso;
import com.pucp.unionseguros.service.VehiculoService.TipoUsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/v1/tipoUsoVehiculo")
public class TipoUsoController {

    private final TipoUsoService tipoUsoService;

    @Autowired
    public TipoUsoController(TipoUsoService tipoUsoService) {
        this.tipoUsoService = tipoUsoService;
    }

    @GetMapping("/listarTodos")
    public List<TipoUso> listTipoUsos(){
       return tipoUsoService.listarTipoUso();
    }

    @GetMapping("/listarActivos")
    public List<TipoUso> listarTipoUsosActivos(){
        return tipoUsoService.listarTipoUsoActivo();
    }
    @PostMapping("/insertar")
    public void registrarNuevoTipoUsoVehiculo(@RequestBody TipoUso tipoUso){
        tipoUsoService.insertarTipoUso(tipoUso);
    }

    @PutMapping("/modificar")
    public TipoUso modificarTipoUso(@RequestBody TipoUso tipoUso){
        return tipoUsoService.updateTipoUso(tipoUso);
    }

    @PutMapping("/eliminar")
    public TipoUso eliminarTipoUso(@RequestBody TipoUso tipoUso){
        return tipoUsoService.deleteTipoUso(tipoUso);
    }
}
