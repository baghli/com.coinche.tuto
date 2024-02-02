package com.belotte.projet;

public enum Couleur {
	PIQUE ("pique"), 
	COEUR("coeur"), 
	CARREAU("carreau"), 
	TREFLE("trefle");

	private final String nom;
	
	private Couleur(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
}
