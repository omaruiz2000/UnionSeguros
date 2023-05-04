package com.pucp.unionseguros.repository.VehiculoRepository;

import com.pucp.unionseguros.model.Vehiculo.MarcaVehiculo;
import com.pucp.unionseguros.model.Vehiculo.Modelo;
import com.pucp.unionseguros.model.Vehiculo.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo,Integer> {

    List<Modelo> findModelosByFidMarcaVehiculo(MarcaVehiculo marcaVehiculo);


}
