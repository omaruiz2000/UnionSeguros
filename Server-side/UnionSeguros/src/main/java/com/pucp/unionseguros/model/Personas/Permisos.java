package com.pucp.unionseguros.model.Personas;

public class Permisos {
    private int id_permiso;
    private String descripcion;
    private boolean activo;


    public Permisos(int id_permiso, String descripcion, boolean activo) {
        this.id_permiso = id_permiso;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(int id_permiso) {
        this.id_permiso = id_permiso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
