package com.pucp.unionseguros.model.SOAT;

import com.pucp.unionseguros.model.Distritos.Distrito;
import com.pucp.unionseguros.model.Personas.Cliente;
import com.pucp.unionseguros.model.Vehiculo.Vehiculo;

import java.util.Date;

public class Poliza {
    private int id_poliza;
    private double precio_base;
    private Date fecha_vigencia_desde;
    private Date fecha_vigencia_fin;
    private Vehiculo vehiculo;
    private Distrito distrito;
    private Cliente cliente;
    private Cobertura cobertura;
    private MetodoDePago metodoDePago;

    private boolean activo;

    public Poliza(int id_poliza, double precio_base, Date fecha_vigencia_desde, Date fecha_vigencia_fin, Vehiculo vehiculo, Distrito distrito, Cliente cliente, Cobertura cobertura, MetodoDePago metodoDePago, boolean activo) {
        this.id_poliza = id_poliza;
        this.precio_base = precio_base;
        this.fecha_vigencia_desde = fecha_vigencia_desde;
        this.fecha_vigencia_fin = fecha_vigencia_fin;
        this.vehiculo = vehiculo;
        this.distrito = distrito;
        this.cliente = cliente;
        this.cobertura = cobertura;
        this.metodoDePago = metodoDePago;
        this.activo = activo;
    }

    public int getId_poliza() {
        return id_poliza;
    }

    public void setId_poliza(int id_poliza) {
        this.id_poliza = id_poliza;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public Date getFecha_vigencia_desde() {
        return fecha_vigencia_desde;
    }

    public void setFecha_vigencia_desde(Date fecha_vigencia_desde) {
        this.fecha_vigencia_desde = fecha_vigencia_desde;
    }

    public Date getFecha_vigencia_fin() {
        return fecha_vigencia_fin;
    }

    public void setFecha_vigencia_fin(Date fecha_vigencia_fin) {
        this.fecha_vigencia_fin = fecha_vigencia_fin;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
