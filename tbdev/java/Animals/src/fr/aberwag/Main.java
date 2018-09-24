package fr.aberwag;

import fr.aberwag.animals.Chien;

public class Main {

	public static void main(String[] args) {

		// première solution
		Chien boby = new Chien("Boby", 125, 600, "Rouge", "race");

		/*
		 * Chien ==+> nom : boby taille 125 poids: 600 couleur: rouge race: race
		 * 
		 */

		System.out.println("Le nom du chien : " + boby.getNom());
		// 2nd solution
		Chien rex = new Chien();
		/*
		 * Chien
		 */

		rex.setNom("Rex");
		/*
		 * Chien ==+> nom: Rex
		 */
		rex.setPoids(300);
		rex.setTaille(500);
		rex.setCouleur("VErt");
		rex.setRace("Race rex");
		/*
		 * Chien ==+> nom : Rex taille 500 poids: 300 couleur: vert race:race rex
		 * 
		 */

	}

}
