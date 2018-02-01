package com.eteg.app.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eteg.app.model.AbstractEntity;
import com.eteg.app.service.exceptions.RegisterExistingException;
import com.eteg.app.service.exceptions.RegisterNotFoundException;

/**
 * 
 * @author Leonardo Lima
 *
 * @param <T>
 * @param <ID>
 */

public abstract class AbstractService<T extends AbstractEntity<ID>, ID extends Serializable> {

    protected final String FAULT_DELETE = "Falha ao apagar";
    protected final String FAULT_POST = "Falha ao salvar";
    protected final String FAIL_GET = "Falha ao buscar";
    protected final String FALHA_PUT = "Falha ao atualizar";    

    protected abstract JpaRepository<T, ID> getRepository();

    public List<T> get() {
        return getRepository().findAll();
    }

    public T post(T entity) {
        if (entity.getId() != null) {
            
            T query = getRepository().findOne(entity.getId());
            
            if (query != null) {
                throw new RegisterExistingException(String.format("%s, O Resgitro já existe.", FAULT_POST));
            }
        }       
        
        return getRepository().save(entity);
    }

    public T get(ID id) {
        T entity = getRepository().findOne(id);

        if (entity == null) {
            throw new RegisterNotFoundException(String.format("%s, O Registro não pôde ser encontrado.", FAIL_GET));
        }
        return entity;
    }

    public void delete(ID id) {
        try {
            getRepository().delete(id);
        } catch (EmptyResultDataAccessException e) {
            throw new RegisterNotFoundException(String.format("%s, O Registro não pôde ser encontrado.", FAULT_DELETE));
        }
    }

    public void put(T entity) {
        T query = getRepository().findOne(entity.getId());

        if (query == null) {
            throw new RegisterNotFoundException(String.format("%s, O registro não pôde ser encontrado.", FALHA_PUT));
        }
        getRepository().save(entity);
    }
}