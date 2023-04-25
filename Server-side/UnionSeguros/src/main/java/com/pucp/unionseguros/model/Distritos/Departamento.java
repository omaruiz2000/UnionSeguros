package com.pucp.unionseguros.model.Distritos;

public class Departamento {
    private int id_departamento;
    private String nombre_departamento;

    private boolean activo;
    public Departamento(int id_departamento, String nombre_departamento,boolean activo) {
        this.id_departamento = id_departamento;
        this.nombre_departamento = nombre_departamento;
        this.activo = activo;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
