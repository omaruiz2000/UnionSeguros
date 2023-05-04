package com.pucp.unionseguros.repository.PersonasRepository;

import com.pucp.unionseguros.model.Personas.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Integer> {
    public List<TipoDocumento> findTipoDocumentoByActivoIsTrue();
}
