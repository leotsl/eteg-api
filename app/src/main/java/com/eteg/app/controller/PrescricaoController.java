package com.eteg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eteg.app.model.Prescricao;
import com.eteg.app.service.AbstractService;
import com.eteg.app.service.PrescricaoService;

/**
 * 
 * @author Leonardo Lima
 *
 */

@RestController
@RequestMapping("/prescricao")
public class PrescricaoController extends AbstractController<Prescricao, Long> {

    @Autowired
    private PrescricaoService prescricaoService;

    @Override
    protected AbstractService<Prescricao, Long> getService() {
        return prescricaoService;
    }

}
