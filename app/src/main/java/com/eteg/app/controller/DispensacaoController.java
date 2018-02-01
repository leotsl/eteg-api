package com.eteg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eteg.app.model.Dispensacao;
import com.eteg.app.service.AbstractService;
import com.eteg.app.service.DispensacaoService;

/**
 * 
 * @author Leonardo Lima
 *
 */

@RestController
@RequestMapping("/dispensacao")
public class DispensacaoController extends AbstractController<Dispensacao, Long> {

    @Autowired
    private DispensacaoService dispensacaoService;

    @Override
    protected AbstractService<Dispensacao, Long> getService() {
        return dispensacaoService;
    }

}

