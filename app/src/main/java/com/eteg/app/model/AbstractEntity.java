package com.eteg.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 
 * @author Leonardo Lima
 *
 * @param <ID>
 */

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

	private static final long serialVersionUID = -6323358535657100144L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
	
	 @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((id == null) ? 0 : id.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        AbstractEntity<?> other = (AbstractEntity<?>) obj;
	        if (id == null) {
	            if (other.id != null) {
	                return false;
	            }
	        } else if (!id.equals(other.id)) {
	            return false;
	        }
	        return true;
	    }
}
