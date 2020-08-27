package com.fstg.gestiondesstagiaires.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Stagee implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nom;
	    @Temporal(javax.persistence.TemporalType.DATE)
	    private Date dateDeb;
	    @Temporal(javax.persistence.TemporalType.DATE)
	    private Date dateFin;
	    private Double budget;
	    private Double avancement;
	    private int importRest;
	    @ManyToOne
	    private Departement departement;

	    @OneToOne(mappedBy = "stagee")
	    private Encadrant encadrant;

	    @OneToMany(mappedBy = "stagee")
	    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	    private List<Stagiaire> stagiaires;
	    
	    @OneToMany(mappedBy = "stagee")
	    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	    private List<Tache> taches;

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

		public Date getDateDeb() {
			return dateDeb;
		}

		public void setDateDeb(Date dateDeb) {
			this.dateDeb = dateDeb;
		}

		public Date getDateFin() {
			return dateFin;
		}

		public void setDateFin(Date dateFin) {
			this.dateFin = dateFin;
		}

		public Double getBudget() {
			return budget;
		}

		public void setBudget(Double budget) {
			this.budget = budget;
		}

		public Double getAvancement() {
			return avancement;
		}

		public void setAvancement(Double avancement) {
			this.avancement = avancement;
		}

		public int getImportRest() {
			return importRest;
		}

		public void setImportRest(int importRest) {
			this.importRest = importRest;
		}

		public Departement getDepartement() {
			return departement;
		}

		public void setDepartement(Departement departement) {
			this.departement = departement;
		}

		public Encadrant getEncadrant() {
			return encadrant;
		}

		public void setEncadrant(Encadrant encadrant) {
			this.encadrant = encadrant;
		}

		public List<Stagiaire> getStagiaires() {
			return stagiaires;
		}

		public void setStagiaires(List<Stagiaire> stagiaires) {
			this.stagiaires = stagiaires;
		}

		public List<Tache> getTaches() {
			return taches;
		}

		public void setTaches(List<Tache> taches) {
			this.taches = taches;
		}

	    

}
