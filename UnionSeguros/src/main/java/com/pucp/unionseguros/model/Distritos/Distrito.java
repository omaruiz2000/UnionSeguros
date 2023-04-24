package com.pucp.unionseguros.model.Distritos;

public class Distrito extends Provincia{
    private int id_distrito;
    private String nombre_distrito;

    public Distrito(int id_departamento, String nombre_departamento, int id_provincia, String nombre_provincia, int id_distrito, String nombre_distrito) {

        super(id_departamento, nombre_departamento, id_provincia, nombre_provincia);
        this.id_distrito = id_distrito;
        this.nombre_distrito = nombre_distrito;
    }

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }

    public String getNombre_distrito() {
        return nombre_distrito;
    }

    public void setNombre_distrito(String nombre_distrito) {
        this.nombre_distrito = nombre_distrito;
    }
}
