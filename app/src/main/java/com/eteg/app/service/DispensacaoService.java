package com.eteg.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.eteg.app.model.Dispensacao;
import com.eteg.app.repository.DispensacaoRepository;

/**
 * 
 * @author Leonardo Lima
 *
 */

@Service
public class DispensacaoService extends AbstractService<Dispensacao, Long> {

    @Autowired
    private DispensacaoRepository dispensacaoRepository;

    @Override
    protected JpaRepository<Dispensacao, Long> getRepository() {
        return dispensacaoRepository;
    }

}