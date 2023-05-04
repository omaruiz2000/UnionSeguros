package com.pucp.unionseguros.repository.SOATRepository;

import com.pucp.unionseguros.model.SOAT.PlanSOAT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PlanSOATRepository extends JpaRepository<PlanSOAT, Integer> {
    public PlanSOAT findPlanSOATByIdAndActivoIsTrue(Integer id);
    public List<PlanSOAT> findPlanSOATByActivoIsTrue();

}
