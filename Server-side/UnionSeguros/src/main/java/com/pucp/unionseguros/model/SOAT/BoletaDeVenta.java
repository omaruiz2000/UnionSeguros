package com.pucp.unionseguros.model.SOAT;

import com.pucp.unionseguros.model.Distritos.Distrito;
import com.pucp.unionseguros.model.Personas.Cliente;
import com.pucp.unionseguros.model.Vehiculo.Vehiculo;

import java.util.Date;

public class BoletaDeVenta extends SOAT{
    private int id_boleta;
    private Date fecha_emision;
    private double monto;

    public BoletaDeVenta(int id_poliza, double precio_base, Date fecha_vigencia_desde, Date fecha_vigencia_fin, Vehiculo vehiculo, Distrito distrito, Cliente cliente, Cobertura cobertura, MetodoDePago metodoDePago, int id_soat, Date fecha_de_emision, double monto_prima, int id_boleta, Date fecha_emision, double monto) {
        super(id_poliza, precio_base, fecha_vigencia_desde, fecha_vigencia_fin, vehiculo, distrito, cliente, cobertura, metodoDePago, id_soat, fecha_de_emision, monto_prima);
        this.id_boleta = id_boleta;
        this.fecha_emision = fecha_emision;
        this.monto = monto;
    }

    public int getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
