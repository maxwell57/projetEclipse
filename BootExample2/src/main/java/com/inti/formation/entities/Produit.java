
package com.inti.formation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produit implements Serializable {
	
	private static final long SerialVersionUID = 1L;
	@Id
	private int id_produit;
	private String description;
	private int prix;
	private int quantité;
	
	

	public Produit() {
		super();
	}

	

	public Produit(int id_produit, String description, int prix, int quantité) {
		super();
		this.id_produit = id_produit;
		this.description = description;
		this.prix = prix;
		this.quantité = quantité;
	}
	
	



	public int getId_produit() {
		return id_produit;
	}



	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getPrix() {
		return prix;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}



	public int getQuantité() {
		return quantité;
	}



	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}
	
	



	@Override
	public String toString() {
		return "Produit [id_produit=" + id_produit + ", description=" + description + ", prix=" + prix + ", quantité="
				+ quantité + "]";
	}



	public static long getSerialversionuid() {
		return SerialVersionUID;
	}
	
	

	
	
}