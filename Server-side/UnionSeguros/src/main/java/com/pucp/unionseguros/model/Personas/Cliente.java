/*
Nombre del archivo:    Cliente
Autor:                Sergio Dadic
Descripcion:        Archivo model de la clase Cliente
*/

package com.pucp.unionseguros.model.Personas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "id_persona")
public class Cliente extends Usuario{

    @Column(name = "activo")
    private boolean activo;

    @Column(name = "baneado")
    private boolean baneado;

    @ManyToOne
    @JoinColumn(name = "fid_roles")
    private Roles fidRoles;




}
