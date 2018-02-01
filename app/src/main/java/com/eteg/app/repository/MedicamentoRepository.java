package com.eteg.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eteg.app.model.Medicamento;

/**
 * 
 * @author Leonardo Lima
 *
 */

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

}
