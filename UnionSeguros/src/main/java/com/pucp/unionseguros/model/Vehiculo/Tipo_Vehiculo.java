package com.pucp.unionseguros.model.Vehiculo;

public class Tipo_Vehiculo {
    private int id_tipo_vehiculo;
    private String nombre_tipo_vehiculo;

    public Tipo_Vehiculo(int id_tipo_vehiculo, String nombre_tipo_vehiculo) {
        this.id_tipo_vehiculo = id_tipo_vehiculo;
        this.nombre_tipo_vehiculo = nombre_tipo_vehiculo;
    }

    public int getId_tipo_vehiculo() {
        return id_tipo_vehiculo;
    }

    public void setId_tipo_vehiculo(int id_tipo_vehiculo) {
        this.id_tipo_vehiculo = id_tipo_vehiculo;
    }

    public String getNombre_tipo_vehiculo() {
        return nombre_tipo_vehiculo;
    }

    public void setNombre_tipo_vehiculo(String nombre_tipo_vehiculo) {
        this.nombre_tipo_vehiculo = nombre_tipo_vehiculo;
    }
}
