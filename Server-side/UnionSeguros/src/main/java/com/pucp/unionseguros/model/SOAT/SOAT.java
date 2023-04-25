package com.pucp.unionseguros.model.SOAT;

import com.pucp.unionseguros.model.Distritos.Distrito;
import com.pucp.unionseguros.model.Personas.Cliente;
import com.pucp.unionseguros.model.Vehiculo.Vehiculo;

import java.util.Date;

public class SOAT extends Poliza{

    private int id_soat;
    private Date fecha_de_emision;
    private double monto_prima;

    private  boolean activo;


    public SOAT(int id_poliza, double precio_base, Date fecha_vigencia_desde, Date fecha_vigencia_fin, Vehiculo vehiculo, Distrito distrito, Cliente cliente, Cobertura cobertura, MetodoDePago metodoDePago, boolean activo, int id_soat, Date fecha_de_emision, double monto_prima, boolean activo1) {
        super(id_poliza, precio_base, fecha_vigencia_desde, fecha_vigencia_fin, vehiculo, distrito, cliente, cobertura, metodoDePago, activo);
        this.id_soat = id_soat;
        this.fecha_de_emision = fecha_de_emision;
        this.monto_prima = monto_prima;
        this.activo = activo1;
    }

    public int getId_soat() {
        return id_soat;
    }

    public void setId_soat(int id_soat) {
        this.id_soat = id_soat;
    }

    public Date getFecha_de_emision() {
        return fecha_de_emision;
    }

    public void setFecha_de_emision(Date fecha_de_emision) {
        this.fecha_de_emision = fecha_de_emision;
    }

    public double getMonto_prima() {
        return monto_prima;
    }

    public void setMonto_prima(double monto_prima) {
        this.monto_prima = monto_prima;
    }

    @Override
    public boolean isActivo() {
        return activo;
    }

    @Override
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
