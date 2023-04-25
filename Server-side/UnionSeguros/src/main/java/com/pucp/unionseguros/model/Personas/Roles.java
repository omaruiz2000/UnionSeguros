package com.pucp.unionseguros.model.Personas;

import java.util.ArrayList;

public class Roles {
    private int id_rol;
    private String descripcion;
    private String nombre_rol;

    private ArrayList<Permisos> lista_permisos;

    public Roles(int id_rol, String descripcion, String nombre_rol, ArrayList<Permisos> lista_permisos) {
        this.id_rol = id_rol;
        this.descripcion = descripcion;
        this.nombre_rol = nombre_rol;
        this.lista_permisos = lista_permisos;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public ArrayList<Permisos> getLista_permisos() {
        return lista_permisos;
    }

    public void setLista_permisos(ArrayList<Permisos> lista_permisos) {
        this.lista_permisos = lista_permisos;
    }
}
