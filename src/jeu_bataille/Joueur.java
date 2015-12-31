package jeu_bataille;

import java.util.ArrayList;

public class Joueur {
// Tableau de cartes & points
	private ArrayList<Carte> main_joueur;
	private int compteur_points;
	
	public Joueur() {
		this.main_joueur = new ArrayList<Carte>();
		this.compteur_points = 0;
	}

	// Accesseur et modification
	public ArrayList<Carte> getMain_joueur() {
		return main_joueur;
	}

	public void setMain_joueur(ArrayList<Carte> main_joueur) {
		this.main_joueur = main_joueur;
	}

	public int getCompteur_points() {
		return compteur_points;
	}

	public void setCompteur_points() {
		this.compteur_points += 1;
	}

	
	// Tirer une carte
	public Carte tirerCarte(int i) {
		return main_joueur.get(i);
	}
	
	// Joueur une carte
	public void jouerCarte(Carte c) {
		this.main_joueur.add(c);
	}
}
