package com.pucp.unionseguros.repository.VehiculoRepository;

import com.pucp.unionseguros.model.Vehiculo.TipoUso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoUsoRepository extends JpaRepository<TipoUso,Integer> {
    public List<TipoUso> findTipoUsosByActivoIsTrue();
    public TipoUso findTipoUsoByIdTipoUsoAndActivoIsTrue(Integer idTipoUso);
}
