package com.fstg.gestiondesstagiaires.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Departement implements Serializable{

	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nom;
	    
	    @OneToMany(mappedBy = "departement")
	    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	    private List<Stagee> stagees;
	    
	    @OneToMany(mappedBy = "departement")
	    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	    private List<Encadrant> encadrants;
	    @OneToMany(mappedBy = "departement")
	    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	    private List<Stagiaire> stagiaires;
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
		public List<Stagee> getStagees() {
			return stagees;
		}
		public void setStagees(List<Stagee> stagees) {
			this.stagees = stagees;
		}
		public List<Encadrant> getEncadrants() {
			return encadrants;
		}
		public void setEncadrants(List<Encadrant> encadrants) {
			this.encadrants = encadrants;
		}
		public List<Stagiaire> getStagiaires() {
			return stagiaires;
		}
		public void setStagiaires(List<Stagiaire> stagiaires) {
			this.stagiaires = stagiaires;
		}
	    
	    
}
