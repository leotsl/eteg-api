package com.eteg.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.eteg.app.model.Prescricao;
import com.eteg.app.repository.PrescricaoRepository;

/**
 * 
 * @author Leonardo Lima
 *
 */

@Service
public class PrescricaoService extends AbstractService<Prescricao, Long> {

    @Autowired
    private PrescricaoRepository prescricaoRepository;

    @Override
    protected JpaRepository<Prescricao, Long> getRepository() {
        return prescricaoRepository;
    }

}