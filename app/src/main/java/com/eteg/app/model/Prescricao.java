package com.eteg.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *
 * @author Leonardo Lima
 *
 */
@Entity
@Table(name = "prescricao")
public class Prescricao extends AbstractEntity<Long> {

    private String medico;
    
    @ManyToOne
    private Paciente paciente;
 
    @ManyToMany
    private List<Medicamento> medicamentos;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date data;

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
