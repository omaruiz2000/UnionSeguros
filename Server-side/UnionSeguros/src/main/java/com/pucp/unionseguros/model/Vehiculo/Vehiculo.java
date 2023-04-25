package com.pucp.unionseguros.model.Vehiculo;

import com.pucp.unionseguros.model.Personas.Persona;

import java.util.Date;

public class Vehiculo {
    private int id_vehiculo;
    private Date anho_fabricacion;
    private int numero_asientos;
    private String placa;

    private Tipo_Uso tipo_uso;
    private Modelo modelo;

    private Persona dueño;

    private boolean activo;

    public Vehiculo(int id_vehiculo, Date anho_fabricacion, int numero_asientos, String placa, Tipo_Uso tipo_uso, Modelo modelo, Persona dueño, boolean activo) {
        this.id_vehiculo = id_vehiculo;
        this.anho_fabricacion = anho_fabricacion;
        this.numero_asientos = numero_asientos;
        this.placa = placa;
        this.tipo_uso = tipo_uso;
        this.modelo = modelo;
        this.dueño = dueño;
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public Date getAnho_fabricacion() {
        return anho_fabricacion;
    }

    public void setAnho_fabricacion(Date anho_fabricacion) {
        this.anho_fabricacion = anho_fabricacion;
    }

    public int getNumero_asientos() {
        return numero_asientos;
    }

    public void setNumero_asientos(int numero_asientos) {
        this.numero_asientos = numero_asientos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Tipo_Uso getTipo_uso() {
        return tipo_uso;
    }

    public void setTipo_uso(Tipo_Uso tipo_uso) {
        this.tipo_uso = tipo_uso;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }
}
