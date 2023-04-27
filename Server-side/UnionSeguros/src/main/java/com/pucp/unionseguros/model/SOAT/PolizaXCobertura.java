package com.pucp.unionseguros.model.SOAT;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "poliza_x_cobertura")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PolizaXCobertura {

    @Id
    @Column(name = "id_poliza_x_cobertura", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fid_poliza")
    private Poliza fidPoliza;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fid_cobertura")
    private Cobertura fidCobertura;
}
