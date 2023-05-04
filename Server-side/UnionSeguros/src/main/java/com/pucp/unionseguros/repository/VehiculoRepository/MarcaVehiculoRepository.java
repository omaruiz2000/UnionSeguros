package com.pucp.unionseguros.repository.VehiculoRepository;

import com.pucp.unionseguros.model.Vehiculo.MarcaVehiculo;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaVehiculoRepository extends JpaRepository<MarcaVehiculo,Integer> {
    public MarcaVehiculo findMarcaVehiculoById(Integer idMarca);
}
