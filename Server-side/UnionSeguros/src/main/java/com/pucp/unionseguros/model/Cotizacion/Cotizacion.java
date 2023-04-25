package com.pucp.unionseguros.model.Cotizacion;

import com.pucp.unionseguros.model.Distritos.Distrito;
import com.pucp.unionseguros.model.Personas.Cliente;
import com.pucp.unionseguros.model.Vehiculo.Vehiculo;

import java.util.ArrayList;
import java.util.Date;

public class Cotizacion {
    private int id_cotizacion;
    private Date fecha_cotizacion;
    private double monto_estimado;

    private Cliente cliente;
    private Vehiculo vehiculo;
    private Distrito distrito;

    private ArrayList<DetalleCotizacion> listaBeneficios;

    public int getId_cotizacion() {
        return id_cotizacion;
    }

    public void setId_cotizacion(int id_cotizacion) {
        this.id_cotizacion = id_cotizacion;
    }

    public Date getFecha_cotizacion() {
        return fecha_cotizacion;
    }

    public void setFecha_cotizacion(Date fecha_cotizacion) {
        this.fecha_cotizacion = fecha_cotizacion;
    }

    public double getMonto_estimado() {
        return monto_estimado;
    }

    public void setMonto_estimado(double monto_estimado) {
        this.monto_estimado = monto_estimado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public ArrayList<DetalleCotizacion> getListaBeneficios() {
        return listaBeneficios;
    }

    public void setListaBeneficios(ArrayList<DetalleCotizacion> listaBeneficios) {
        this.listaBeneficios = listaBeneficios;
    }

    public Cotizacion(int id_cotizacion, Date fecha_cotizacion, double monto_estimado, Cliente cliente, Vehiculo vehiculo, Distrito distrito, ArrayList<DetalleCotizacion> listaBeneficios) {
        this.id_cotizacion = id_cotizacion;
        this.fecha_cotizacion = fecha_cotizacion;
        this.monto_estimado = monto_estimado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.distrito = distrito;
        this.listaBeneficios = listaBeneficios;
    }
}
