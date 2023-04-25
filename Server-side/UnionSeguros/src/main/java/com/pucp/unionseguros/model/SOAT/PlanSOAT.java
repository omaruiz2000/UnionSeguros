package com.pucp.unionseguros.model.SOAT;

public class PlanSOAT {
    private int id_plan_soat;
    private double cobertura;
    private double precio;

    public PlanSOAT(int id_plan_soat, double cobertura, double precio) {
        this.id_plan_soat = id_plan_soat;
        this.cobertura = cobertura;
        this.precio = precio;
    }

    public int getId_plan_soat() {
        return id_plan_soat;
    }

    public void setId_plan_soat(int id_plan_soat) {
        this.id_plan_soat = id_plan_soat;
    }

    public double getCobertura() {
        return cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
