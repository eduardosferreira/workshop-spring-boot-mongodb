package com.eduardosferreira.workshopsbmongo.domain.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import com.eduardosferreira.workshopsbmongo.domain.exception.DomainRunTimeException;

public abstract class People implements Serializable, Comparable<People> {
	
	private static final long serialVersionUID = 1L;
	private static Long instance = 0l;
	public static Long getInstance() {
		return instance;
	}
	protected static void setInstance(Long instance) {
		People.instance = instance;
	}

	@Id
	private String id;
	private String name;
	
	
	public String getId() {
		return id;
	}
	protected void setId(String id) {
		if (id == null || id.trim().equals("") || id.trim().equals("0")) 
			throw new DomainRunTimeException("Invalid Argument! " + id);
		
		this.id = id;
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		if (name == null || name.trim().equals("")) 
			throw new DomainRunTimeException("Invalid Argument! " + name);

		this.name = name;
	}

	protected People() {
		super();
		People.setInstance(instance + 1); 
	}
	
	public People(String id, String name) {
		this();
		this.setId(id);
		this.setName(name);
	}
	
	public People(String name) {
		this();
		this.setId(People.instance.toString());
		this.setName(name);
	}

	@Override
	public String toString() {
		return "id= " + this.getId() + ", name= " + this.getName();
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(People o) {
		return o.getId().trim().toUpperCase().compareToIgnoreCase(this.getId().trim().toUpperCase());
	}
	
	

}
