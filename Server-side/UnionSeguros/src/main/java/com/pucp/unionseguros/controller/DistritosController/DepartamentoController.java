package com.pucp.unionseguros.controller.DistritosController;

import com.pucp.unionseguros.model.Distritos.Departamento;
import com.pucp.unionseguros.model.Personas.TipoDocumento;
import com.pucp.unionseguros.repository.DistritosRepository.DepartamentoRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartamentoController {
    @Autowired
    DepartamentoRepository departamentoRepository;

    @GetMapping("/Departamento")
    public String prueba3(){
        Departamento departamento = new Departamento();
        departamento.setActivo(true);
//        departamento.setNombreDepartamento("Amazonas");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Áncash");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Apurímac");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Arequipa");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Ayacucho");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Cajamarca");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Cusco");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Huancavelica");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Huánuco");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Ica");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Junín");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("La Libertad");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Lambayeque");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Lima");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Loreto");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Madre de Dios");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Moquegua");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Pasco");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Piura");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Puno");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("San Martín");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Tacna");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Tumbes");
//        departamento = departamentoRepository.save(departamento);
//        departamento.setNombreDepartamento("Ucayali");
//        departamento = departamentoRepository.save(departamento);

        return "algo";
    }

}
