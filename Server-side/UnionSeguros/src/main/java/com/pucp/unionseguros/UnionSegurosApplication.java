package com.pucp.unionseguros;

import com.pucp.unionseguros.model.Personas.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class UnionSegurosApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnionSegurosApplication.class, args);

    }
    @GetMapping("/")
    public String Prueba1(){
        return "Vamos bien primer itnento";
    }

}
