package com.pucp.unionseguros.repository.DistritosRepository;

import com.pucp.unionseguros.model.Distritos.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito,Integer> {
}
