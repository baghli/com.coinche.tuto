package com.belotte.projet;

public enum Figure {
	SEPT("Sept ",0,1 ),
	HUITE("Huite ",0,2),
	NEUF("Neuf ",0,3),
	DIX("Dix ",10,7),
	VALET("Valet ",1,4),
	DAME("Dame ",2,5),
	ROI("Roi ",3,6),
	AS("As ",11,8);
	
	private final String nom;
	private final int points;
	private final int poids;
	private Figure(String nom, int points, int poids) {
		this.nom = nom;
		this.points = points;
		this.poids = poids;
	}
	public String getNom() {
		return nom;
	}
	public int getPoints() {
		return points;
	}
	public int getPoids() {
		return poids;
	}
	

		
}
