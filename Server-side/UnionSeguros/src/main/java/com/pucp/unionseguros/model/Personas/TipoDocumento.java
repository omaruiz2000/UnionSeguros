package com.pucp.unionseguros.model.Personas;

import com.pucp.unionseguros.model.SOAT.BoletaDeVenta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_documento")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TipoDocumento {
    @Id
    @Column(name = "id_tipo_documento", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 20)
    private String nombre;

    @Column(name = "activo")
    private boolean activo;



}
