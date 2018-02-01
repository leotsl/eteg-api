package com.eteg.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eteg.app.model.Paciente;

/**
 * 
 * @author Leonardo Lima
 *
 */

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
