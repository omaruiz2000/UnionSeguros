package com.pucp.unionseguros.model.Cotizacion;

public class DetalleCotizacion {
    private int id_detalle_cotizacion;
    private String beneficio;
    private double monto_adicional;

    public DetalleCotizacion(int id_detalle_cotizacion, String beneficio, double monto_adicional) {
        this.id_detalle_cotizacion = id_detalle_cotizacion;
        this.beneficio = beneficio;
        this.monto_adicional = monto_adicional;
    }

    public int getId_detalle_cotizacion() {
        return id_detalle_cotizacion;
    }

    public void setId_detalle_cotizacion(int id_detalle_cotizacion) {
        this.id_detalle_cotizacion = id_detalle_cotizacion;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public double getMonto_adicional() {
        return monto_adicional;
    }

    public void setMonto_adicional(double monto_adicional) {
        this.monto_adicional = monto_adicional;
    }
}
