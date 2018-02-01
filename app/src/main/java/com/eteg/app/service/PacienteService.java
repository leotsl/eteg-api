package com.eteg.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.eteg.app.model.Paciente;
import com.eteg.app.repository.PacienteRepository;

/**
 * 
 * @author Leonardo Lima
 *
 */

@Service
public class PacienteService extends AbstractService<Paciente, Long> {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    protected JpaRepository<Paciente, Long> getRepository() {
        return pacienteRepository;
    }

}
