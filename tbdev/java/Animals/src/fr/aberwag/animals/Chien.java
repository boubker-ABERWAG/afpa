package fr.aberwag.animals;

public class Chien extends Animal{
	


	public Chien() {
		super();
	}
	public Chien(String nom, int taille, int poids, String couleur, String race) {
		super(nom, taille, poids, couleur, race);
	}
	public void aboyer() {
		System.out.println("Waf waf waf ....");
	}
	public void mordre() {
		System.out.println("bien fait pour toi la prochaine fois tu réflichiras avant de prendre ma gamelle grrrrrrrrrrr");
	}
}
