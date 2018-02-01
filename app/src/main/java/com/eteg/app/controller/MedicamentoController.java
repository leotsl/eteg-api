package com.eteg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eteg.app.model.Medicamento;
import com.eteg.app.service.AbstractService;
import com.eteg.app.service.MedicamentoService;

/**
 * 
 * @author Leonardo Lima
 *
 */

@RestController
@RequestMapping("/medicamento")
public class MedicamentoController extends AbstractController<Medicamento, Long> {

    @Autowired
    private MedicamentoService medicamentoService;

    @Override
    protected AbstractService<Medicamento, Long> getService() {
        return medicamentoService;
    }

}
