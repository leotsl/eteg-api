package com.eteg.app.controller;

import java.io.Serializable;
import java.net.URI;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.validation.Valid;

import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eteg.app.model.AbstractEntity;
import com.eteg.app.service.AbstractService;

/**
 * 
 * @author Leonardo Lima
 *
 * @param <T>
 * @param <ID>
 */

public abstract class AbstractController<T extends AbstractEntity<ID>, ID extends Serializable> {

    protected abstract AbstractService<T, ID> getService();

    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<T>> get() {
        return ResponseEntity.status(HttpStatus.OK).body(getService().get());
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, 
    		 consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Void> post(@RequestBody T entidade) {
        entidade = getService().post(entidade);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entidade.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> get(@PathVariable("id") ID id) {
        T entidade = getService().get(id);

        CacheControl cacheControl = CacheControl.maxAge(20, TimeUnit.SECONDS);

        return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(entidade);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable("id") ID id) {
        getService().delete(id);
        return ResponseEntity.noContent().build();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> put(@RequestBody T entidade, @PathVariable("id") ID id) {
        entidade.setId(id);
        getService().put(entidade);

        return ResponseEntity.noContent().build();
    }
  
}
