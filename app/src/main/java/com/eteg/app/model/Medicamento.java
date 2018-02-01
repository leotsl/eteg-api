package com.eteg.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @author Leonardo Lima
 *
 */

@Entity
@Table(name="medicamento")
public class Medicamento extends AbstractEntity<Long>{

    @ManyToMany(mappedBy = "medicamentos")
    private List<Prescricao> prescricaos;

    private String nome;   
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
