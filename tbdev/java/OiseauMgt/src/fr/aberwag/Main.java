package fr.aberwag;

import fr.aberwag.oiseau.Autruche;
import fr.aberwag.oiseau.Canard;
import fr.aberwag.oiseau.Manchot;
import fr.aberwag.oiseau.Pigeon;

public class Main {

	public static void main(String[] args) {

		Pigeon pigeonVoyageur = new Pigeon("Vaillant", 100, 150, "Pigeon voyageur", true);
		pigeonVoyageur.jouer();
		Manchot manchotAvecPlumes = new Manchot("Manchot Z", 600, 650, "M", true);
		manchotAvecPlumes.nager();

		Utils.verifierPlumes(manchotAvecPlumes.isPlumes());

		int moyenneTaillePigVoyManchAvPl = Utils.calculMoyenneTaille(pigeonVoyageur.getTaille(),
				manchotAvecPlumes.getTaille());
		System.out.println(moyenneTaillePigVoyManchAvPl);

		int moyennePoidsPigVoManchAvecPlumes = Utils.calculMoyennePoids(pigeonVoyageur.getPoids(),
				manchotAvecPlumes.getPoids());
		System.out.println(moyennePoidsPigVoManchAvecPlumes);

		pigeonVoyageur.voler();
		Autruche autruche = new Autruche();
		System.out.println("Autruche:");

		pigeonVoyageur.voler();

		System.out.println("=================== Canard ===============================");
		Canard donald = new Canard();
		donald.voler();
		donald.nager();
	}

}