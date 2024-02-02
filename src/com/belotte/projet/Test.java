package com.belotte.projet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carte carte=new Carte(Couleur.CARREAU, Figure.DAME, false);
		Carte carte1=new Carte(Couleur.PIQUE, Figure.NEUF);
		System.out.println(carte);
	}

}
