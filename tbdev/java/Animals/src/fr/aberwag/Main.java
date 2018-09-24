package fr.aberwag;

import fr.aberwag.animals.Animal;
import fr.aberwag.animals.Chien;
import fr.aberwag.animals.Vache;
import fr.aberwag.animals.Loup;
import fr.aberwag.animals.Lapin;
import fr.aberwag.animals.Chat;

public class Main {

	public static void main(String[] args) {
		
		Chien ada = new Chien("Ada", 152, 5, "Noir", "levrier");
		System.out.println("La couleur du chien " + ada.getNom()  + "est le : " + ada.getCouleur());
		
		Chien rex = new Chien("Rex", 120, 2, "Rouge", "bulldog");
		
		System.out.println("Le chien " + rex.getNom() + " est un " + rex.getRace() + " de " + rex.getPoids() + "kg");
		
		System.out.println("SI on additionne le poids du chien " + ada.getNom() + " et le poids du chien " + rex.getNom() + " on obtient : " + (ada.getPoids() + rex.getPoids()));
		
		ada.manger();
		
		rex.mordre();
		Vache ops = new Vache("Ops", 160, 500, "blanc", "angus");
		
		ops.beugler();
		
		ops.dormir();
		
		Chien marcus = new Chien("Marcus", 20, 3, "Bleu" , "Teckel");
		System.out.println("LE chien : " + marcus.getNom());
		
		Animal monAnimal = new Chien("Chien sans nom", 10, 1, "Gris", "MAstiff");
		System.out.println(monAnimal.getNom());
		monAnimal.manger();
		
		monAnimal = new Chat("Marcus", 12, 12, "Blanc", "Chat");
		System.out.println(monAnimal.getNom());
		
		Animal loup = new Loup("LOUP", 115, 15, "BLEU", "loup garou");
		
		Chat chat1 = new Chat("Chat n° 1 ", 125, 125, "Rouge", "Persan");
		//System.out.println(chat1.jeuPref);
		System.out.println("Jeu pref: " + chat1.getJeuPref());
		chat1.setJeuPref("Rugby");
		System.out.println("Jeu pref: " + chat1.getJeuPref());
		chat1.setJeuPref("");
		System.out.println("Jeu pref: " + chat1.getJeuPref());
		
	}

}
