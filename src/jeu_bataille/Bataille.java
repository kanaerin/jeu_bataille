package jeu_bataille;

import java.util.ArrayList;

public class Bataille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jeu de la bataille GO!");
		
		Carte c;
		int i;
		String gagnant;
		
		Joueur j1 = new Joueur();
		Joueur j2 = new Joueur();
		
		ArrayList<Carte> main_joueur = new ArrayList<Carte>();
		
		// Paquet de carte
		
		for(int j = 0; j < 4; j++){
			for(int k = 0; k < 13; k++){
				main_joueur.add(new Carte(Carte.couleurs[j],Carte.valeurs[k]));
			}
		}
		
		// Partages du packet en deux
		i = 0;
		while(main_joueur.size() > 0){
			int ind = (int)(Math.random()*(main_joueur.size()-0)+0);
			c = main_joueur.get(ind);
		
			if(i % 2 == 0){
				j1.jouerCarte(c);
			}else{
				j2.jouerCarte(c);
			}
			
			main_joueur.remove(ind);
			i++;
		}
		
		
		// Jeu : Tour par tour
		for(int tours = 0; tours < 26; tours++){
			Carte c1 = j1.tirerCarte(tours);
			Carte c2 = j2.tirerCarte(tours);
			
			if(c1.comparaison(c2)){
				j1.setCompteur_points();
			}else if(c2.comparaison(c1)){
				j2.setCompteur_points();
			}
		}
		
		System.out.println("Point j1: " + j1.getCompteur_points());
		System.out.println("Point j2: " + j2.getCompteur_points());
		
		if(j1.getCompteur_points() > j2.getCompteur_points()){
			gagnant = "Joueur 1 gagnant !";
		}else if (j1.getCompteur_points() < j2.getCompteur_points()){
			gagnant = "Joueur 2 gagnant !";
		}else{
			gagnant = "Match Nul !";
		}
		
		System.out.println(gagnant);
		
	}

}
