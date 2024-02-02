package com.belotte.projet;

public class Carte {

	private Couleur couleur;
	private Figure figure;
	private boolean affiche;

public Carte(Couleur couleur, Figure figure) {
		super();
		this.couleur = couleur;
		this.figure = figure;
		affiche=false;
	}


public Carte(Couleur couleur, Figure figure, boolean affiche) {
		super();
		this.couleur = couleur;
		this.figure = figure;
		this.affiche = affiche;
	}


	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Figure getFigure() {
		return figure;
	}

	public void setFigure(Figure figure) {
		this.figure = figure;
	}

	public boolean isAffiche() {
		return affiche;
	}

	public void setAffiche(boolean affiche) {
		this.affiche = affiche;
	}
	
	//méthode pour tourner la carte
	
	public void tourner () {
		affiche=!affiche;
	}
	
	//to string
	
	@Override
	public String toString() {
		
		// TODO Auto-generated method stub
		return null ;
	}
}
