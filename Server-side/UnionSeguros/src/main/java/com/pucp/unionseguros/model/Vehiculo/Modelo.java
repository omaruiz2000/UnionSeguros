package com.pucp.unionseguros.model.Vehiculo;

public class Modelo extends Marca_Vehiculo{
    private int id_modelo;
    private String modelo;

    public Modelo(int id_tipo_vehiculo, String nombre_tipo_vehiculo, int id_marca_vehiculo, String nombre_marca) {
        super(id_tipo_vehiculo, nombre_tipo_vehiculo, id_marca_vehiculo, nombre_marca);
    }

    public Modelo(int id_tipo_vehiculo, String nombre_tipo_vehiculo, int id_marca_vehiculo, String nombre_marca, int id_modelo, String modelo) {
        super(id_tipo_vehiculo, nombre_tipo_vehiculo, id_marca_vehiculo, nombre_marca);
        this.id_modelo = id_modelo;
        this.modelo = modelo;
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
