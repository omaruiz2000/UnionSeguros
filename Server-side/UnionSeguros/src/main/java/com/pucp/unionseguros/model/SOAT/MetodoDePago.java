package com.pucp.unionseguros.model.SOAT;

import java.util.Date;

public class MetodoDePago {
    private int id_metodo_pago;
    private String nombre_metodo;
    private String numero_tarjeta;
    private String cvv;
    private Date fecha_vencimiento;

    private boolean activo;

    public MetodoDePago(int id_metodo_pago, String nombre_metodo, String numero_tarjeta, String cvv, Date fecha_vencimiento, boolean activo) {
        this.id_metodo_pago = id_metodo_pago;
        this.nombre_metodo = nombre_metodo;
        this.numero_tarjeta = numero_tarjeta;
        this.cvv = cvv;
        this.fecha_vencimiento = fecha_vencimiento;
        this.activo = activo;
    }

    public int getId_metodo_pago() {
        return id_metodo_pago;
    }

    public void setId_metodo_pago(int id_metodo_pago) {
        this.id_metodo_pago = id_metodo_pago;
    }

    public String getNombre_metodo() {
        return nombre_metodo;
    }

    public void setNombre_metodo(String nombre_metodo) {
        this.nombre_metodo = nombre_metodo;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
