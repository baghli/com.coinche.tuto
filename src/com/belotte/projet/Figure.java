package com.belotte.projet;

public enum Figure {
	SEPT("sept ",0,1 ),
	HUITE("huite ",0,2),
	NEUF("neuf ",0,3),
	DIX("dix ",10,7),
	VALET("valet ",1,4),
	DAME("dame ",2,5),
	ROI("roi ",3,6),
	AS("as ",11,8);
	
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
