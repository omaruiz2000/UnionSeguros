/*
Nombre del archivo:    SOAT
Autor:                Sergio Dadic
Descripcion:        Archivo model de la clase SOAT
*/

package com.pucp.unionseguros.model.SOAT;

import com.pucp.unionseguros.model.Distritos.Distrito;
import com.pucp.unionseguros.model.Personas.Cliente;
import com.pucp.unionseguros.model.Vehiculo.Vehiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "soat")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SOAT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_soat", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fid_plan_soat")
    private PlanSOAT fidPlanSoat;

    @ManyToOne
    @JoinColumn(name = "fid_poliza")
    private Poliza fidPoliza;

    @Column(name = "fecha_de_emision")
    private LocalDate fechaDeEmision;

    @Column(name = "monto_prima", precision = 10, scale = 2)
    private double montoPrima;

    @Column(name = "activo")
    private boolean activo;

}
