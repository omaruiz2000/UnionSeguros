package com.pucp.unionseguros.model.Personas;

import java.util.ArrayList;
import java.util.Date;


public class Cliente extends Usuario{

    public Cliente(int id_persona, String nombres, String apellido_paterno, String apellido_materno, Date fecha_nacimiento, String telefono, TipoDocumento tipo_documento, String numero_documento, String direccion) {
        super(id_persona, nombres, apellido_paterno, apellido_materno, fecha_nacimiento, telefono, tipo_documento, numero_documento, direccion);
    }

    private boolean ListaNegra;
    private ArrayList<Roles> listaRoles;

    public boolean isListaNegra() {
        return ListaNegra;
    }

    public void setListaNegra(boolean listaNegra) {
        ListaNegra = listaNegra;
    }

    public ArrayList<Roles> getListaRoles() {
        return listaRoles;
    }

    public void setListaRoles(ArrayList<Roles> listaRoles) {
        this.listaRoles = listaRoles;
    }
}
