/*
Nombre del archivo:    Persona
Autor:                Sergio Dadic
Descripcion:        Archivo model de la clase Persona
*/
package com.pucp.unionseguros.model.Personas;

import com.pucp.unionseguros.service.PersonasService.UsuarioService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "apellido_paterno", length = 30)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", length = 30)
    private String apellidoMaterno;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "telefono")
    private Integer telefono;

    @Column(name = "direccion", length = 100)
    private String direccion;

    @Column(name = "numero_documento", length = 20)
    private String numeroDocumento;

    @Column(name = "activo")
    private boolean activoPersona;

    @ManyToOne
    @JoinColumn(name = "fid_tipo_documento")
    private TipoDocumento fidTipoDocumento;


}
