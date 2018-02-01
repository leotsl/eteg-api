package com.eteg.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.eteg.app.model.Medicamento;
import com.eteg.app.repository.MedicamentoRepository;

/**
 * 
 * @author Leonardo Lima
 *
 */

@Service
public class MedicamentoService extends AbstractService<Medicamento, Long> {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    @Override
    protected JpaRepository<Medicamento, Long> getRepository() {
        return medicamentoRepository;
    }

}
