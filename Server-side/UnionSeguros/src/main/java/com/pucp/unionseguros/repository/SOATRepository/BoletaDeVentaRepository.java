package com.pucp.unionseguros.repository.SOATRepository;

import com.pucp.unionseguros.model.SOAT.BoletaDeVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoletaDeVentaRepository extends JpaRepository<BoletaDeVenta, Integer> {


    public List<BoletaDeVenta> findBoletaDeVentaByActivoIsTrue();

    public BoletaDeVenta findBoletaDeVentaByIdAndActivoIsTrue(Integer idBoleta);
}
