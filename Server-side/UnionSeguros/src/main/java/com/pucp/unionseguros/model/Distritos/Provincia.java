package com.pucp.unionseguros.model.Distritos;

public class Provincia extends Departamento{
    private int id_provincia;
    private String nombre_provincia;

    private  boolean activo;

    public Provincia(int id_departamento, String nombre_departamento, boolean activo, int id_provincia, String nombre_provincia, boolean activo1) {
        super(id_departamento, nombre_departamento, activo);
        this.id_provincia = id_provincia;
        this.nombre_provincia = nombre_provincia;
        this.activo = activo1;
    }

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    public String getNombre_provincia() {
        return nombre_provincia;
    }

    public void setNombre_provincia(String nombre_provincia) {
        this.nombre_provincia = nombre_provincia;
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
