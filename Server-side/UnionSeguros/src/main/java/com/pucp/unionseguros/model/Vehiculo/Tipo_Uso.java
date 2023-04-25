package com.pucp.unionseguros.model.Vehiculo;

public class Tipo_Uso {
    private int id_tipo_uso;
    private String nombre_tipo_uso;

    private boolean activo;

    public Tipo_Uso(int id_tipo_uso, String nombre_tipo_uso, boolean activo) {
        this.id_tipo_uso = id_tipo_uso;
        this.nombre_tipo_uso = nombre_tipo_uso;
        this.activo = activo;
    }

    public int getId_tipo_uso() {
        return id_tipo_uso;
    }

    public void setId_tipo_uso(int id_tipo_uso) {
        this.id_tipo_uso = id_tipo_uso;
    }

    public String getNombre_tipo_uso() {
        return nombre_tipo_uso;
    }

    public void setNombre_tipo_uso(String nombre_tipo_uso) {
        this.nombre_tipo_uso = nombre_tipo_uso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

