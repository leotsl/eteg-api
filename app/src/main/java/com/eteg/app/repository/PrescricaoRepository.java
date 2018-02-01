package com.eteg.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eteg.app.model.Prescricao;

/**
 * 
 * @author Leonardo Lima
 *
 */

@Repository
public interface PrescricaoRepository extends JpaRepository<Prescricao, Long> {

}
