package com.pucp.unionseguros.model.Personas;

import java.util.ArrayList;
import java.util.Date;

public class Administrador extends  Usuario{

    private ArrayList<Roles> lista_roles;

    public Administrador(int id_persona, String nombres, String apellido_paterno, String apellido_materno, Date fecha_nacimiento, String telefono, TipoDocumento tipo_documento, String numero_documento, String direccion, ArrayList<Roles> lista_roles) {
        super(id_persona, nombres, apellido_paterno, apellido_materno, fecha_nacimiento, telefono, tipo_documento, numero_documento, direccion);
        this.lista_roles = lista_roles;
    }

    public ArrayList<Roles> getLista_roles() {
        return lista_roles;
    }

    public void setLista_roles(ArrayList<Roles> lista_roles) {
        this.lista_roles = lista_roles;
    }
}
