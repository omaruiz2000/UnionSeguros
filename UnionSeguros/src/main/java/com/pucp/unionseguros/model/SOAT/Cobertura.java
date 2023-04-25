package com.pucp.unionseguros.model.SOAT;

public class Cobertura {
    private int id_cobertura;
    private String nombre;
    private String descripcion;
    private double costo;

    public Cobertura(int id_cobertura, String nombre, String descripcion, double costo) {
        this.id_cobertura = id_cobertura;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public int getId_cobertura() {
        return id_cobertura;
    }

    public void setId_cobertura(int id_cobertura) {
        this.id_cobertura = id_cobertura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
