package com.pucp.unionseguros.model.SOAT;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "metodo_de_pago")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MetodoDePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo", nullable = false)
    private Integer id;

    @Column(name = "nombre_metodo", length = 100)
    private String nombreMetodo;

    @Column(name = "numero_tarjeta", length = 30)
    private String numeroTarjeta;

    @Column(name = "cvv", length = 5)
    private String cvv;

    @Column(name = "fecha_vencimiento")
    private LocalDate fechaVencimiento;

    @Column(name = "activo")
    private boolean activo;


}
