package com.pucp.unionseguros.model.Personas;

import java.util.Date;

public class Usuario extends Persona{

    private String email;
    private String contraseña;
    private Date fecha_creacion;

    public Usuario(int id_persona, String nombres, String apellido_paterno, String apellido_materno, Date fecha_nacimiento, String telefono, boolean activo, TipoDocumento tipo_documento, String numero_documento, String direccion, String email, String contraseña, Date fecha_creacion) {
        super(id_persona, nombres, apellido_paterno, apellido_materno, fecha_nacimiento, telefono, activo, tipo_documento, numero_documento, direccion);
        this.email = email;
        this.contraseña = contraseña;
        this.fecha_creacion = fecha_creacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
