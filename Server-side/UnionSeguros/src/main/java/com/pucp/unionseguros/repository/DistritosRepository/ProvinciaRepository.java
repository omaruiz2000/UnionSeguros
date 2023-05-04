package com.pucp.unionseguros.repository.DistritosRepository;

import com.pucp.unionseguros.model.Distritos.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia,Integer> {
}
