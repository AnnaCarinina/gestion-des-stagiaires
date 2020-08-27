package com.fstg.gestiondesstagiaires.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tache implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Double avancement;
    private Double importance;
    @ManyToOne
    private Stagee stagee;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getAvancement() {
		return avancement;
	}
	public void setAvancement(Double avancement) {
		this.avancement = avancement;
	}
	public Double getImportance() {
		return importance;
	}
	public void setImportance(Double importance) {
		this.importance = importance;
	}
	public Stagee getStagee() {
		return stagee;
	}
	public void setStagee(Stagee stagee) {
		this.stagee = stagee;
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
		Tache other = (Tache) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

    
}
