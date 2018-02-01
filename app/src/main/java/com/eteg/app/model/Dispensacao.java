package com.eteg.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Leonardo Lima
 *
 */

@Entity
@Table(name = "dispensacao")
public class Dispensacao extends AbstractEntity<Long> {

	@ManyToOne	
	private Prescricao prescricao;
	
	@ManyToOne	
	private Medicamento medicamento;	
		
	private Date data;

	public Prescricao getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(Prescricao prescricao) {
		this.prescricao = prescricao;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
