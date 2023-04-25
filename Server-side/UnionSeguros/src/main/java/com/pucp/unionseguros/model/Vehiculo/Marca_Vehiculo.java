package com.pucp.unionseguros.model.Vehiculo;

public class Marca_Vehiculo {
    private  int id_marca_vehiculo;
    private String nombre_marca;
    private  boolean activo;

    public Marca_Vehiculo(int id_marca_vehiculo, String nombre_marca, boolean activo) {
        this.id_marca_vehiculo = id_marca_vehiculo;
        this.nombre_marca = nombre_marca;
        this.activo = activo;
    }

    public int getId_marca_vehiculo() {
        return id_marca_vehiculo;
    }

    public void setId_marca_vehiculo(int id_marca_vehiculo) {
        this.id_marca_vehiculo = id_marca_vehiculo;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
