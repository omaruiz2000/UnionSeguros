package com.pucp.unionseguros.model.Distritos;

public class Distrito extends Provincia{
    private int id_distrito;
    private String nombre_distrito;

    private boolean activo;

    public Distrito(int id_departamento, String nombre_departamento, boolean activo, int id_provincia, String nombre_provincia, boolean activo1, int id_distrito, String nombre_distrito, boolean activo2) {
        super(id_departamento, nombre_departamento, activo, id_provincia, nombre_provincia, activo1);
        this.id_distrito = id_distrito;
        this.nombre_distrito = nombre_distrito;
        this.activo = activo2;
    }

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }

    public String getNombre_distrito() {
        return nombre_distrito;
    }

    public void setNombre_distrito(String nombre_distrito) {
        this.nombre_distrito = nombre_distrito;
    }

    @Override
    public boolean isActivo() {
        return activo;
    }

    @Override
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
