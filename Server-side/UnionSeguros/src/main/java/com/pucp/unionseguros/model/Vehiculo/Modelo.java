package com.pucp.unionseguros.model.Vehiculo;

public class Modelo {
    private int id_modelo;
    private String modelo;

    private Marca_Vehiculo marca_vehiculo;
    private Tipo_Vehiculo tipo_vehiculo;

    public Modelo(int id_modelo, String modelo, Marca_Vehiculo marca_vehiculo, Tipo_Vehiculo tipo_vehiculo) {
        this.id_modelo = id_modelo;
        this.modelo = modelo;
        this.marca_vehiculo = marca_vehiculo;
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public Marca_Vehiculo getMarca_vehiculo() {
        return marca_vehiculo;
    }

    public void setMarca_vehiculo(Marca_Vehiculo marca_vehiculo) {
        this.marca_vehiculo = marca_vehiculo;
    }

    public Tipo_Vehiculo getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(Tipo_Vehiculo tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
