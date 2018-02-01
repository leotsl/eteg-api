package com.eteg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eteg.app.model.Paciente;
import com.eteg.app.service.AbstractService;
import com.eteg.app.service.PacienteService;

/**
 * 
 * @author Leonardo Lima
 *
 */

@RestController
@RequestMapping("/paciente")
public class PacienteController extends AbstractController<Paciente, Long> {

    @Autowired
    private PacienteService pacienteService;

    @Override
    protected AbstractService<Paciente, Long> getService() {
        return pacienteService;
    }

}
