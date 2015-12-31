package jeu_bataille;

public class Carte {
	private String couleur;
	private int valeur;
	
	//Constructeur pour crer une carte
	public Carte(String couleur, int valeur) {
		this.setCouleur(couleur);
		this.setValeur(valeur);
	}

	// fonction static pour couleurs & valeurs
	public static String[] couleurs = { 
		"trefle", "pique", "coeur", "carreau"
	};
	
	// 11 : valet, 12 : dame, 13 : roi, 14 : as
	public static int[] valeurs = {
		2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
	};
	
	// Accesseurs et modificateurs 
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	// Comparaison
	public boolean comparaison(Carte c) {
		if((this.valeur > c.valeur && c.valeur != 1) || this.valeur == 1){
			return true;
		}else{
			return false;
		}
	}
}
