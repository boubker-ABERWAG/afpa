package fr.aberwag;

public class Utils {
	public static void verifierPlumes(boolean plumes) {
		if (plumes) {
			System.out.println("Vote oiseau à des plumes");
		} else {
			System.out.println("Votre oiseau n'a pas de plulmes");
		}
	}

	public static int calculMoyenneTaille(int taille1, int taille2) {
		int resultat = (taille1 + taille2) / 2;
		return resultat;
	}

	public static int calculMoyennePoids(int poids1, int poids2) {
		int resultat = (poids1 + poids2) / 2;
		return resultat;
	}
}
