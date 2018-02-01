package com.eteg.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eteg.app.model.Dispensacao;

/**
 * 
 * @author Leonardo Lima
 *
 */

@Repository
public interface DispensacaoRepository extends JpaRepository<Dispensacao, Long> {
    
}
