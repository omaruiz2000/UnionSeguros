package com.pucp.unionseguros.repository.PersonasRepository;

import com.pucp.unionseguros.model.Personas.Permisos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermisosRepository extends JpaRepository<Permisos,Integer> {
    public List<Permisos> findPermisosByActivoIsTrue();

    public Permisos findPermisosByIdAndActivoIsTrue(Integer idPermiso);
}
