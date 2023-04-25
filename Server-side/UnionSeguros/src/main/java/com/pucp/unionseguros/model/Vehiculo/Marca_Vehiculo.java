package com.pucp.unionseguros.model.Vehiculo;

public class Marca_Vehiculo extends Tipo_Vehiculo{
    private  int id_marca_vehiculo;
    private String nombre_marca;

    public Marca_Vehiculo(int id_tipo_vehiculo, String nombre_tipo_vehiculo, int id_marca_vehiculo, String nombre_marca) {
        super(id_tipo_vehiculo, nombre_tipo_vehiculo);
        this.id_marca_vehiculo = id_marca_vehiculo;
        this.nombre_marca = nombre_marca;
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
}
