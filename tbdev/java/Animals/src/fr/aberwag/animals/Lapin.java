package fr.aberwag.animals;

public class Lapin extends Animal {
	
	public String nom;
	public int taille;
	public int poids;
	public String couleur;
	public String race;
	public Lapin() {
		super();
	}
	public Lapin(String nom, int taille, int poids, String couleur, String race) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.couleur = couleur;
		this.race = race;
	}
	
	public void manger() {
		System.out.println("Miam, miam, c'est bon");
	}
	public void dormir() {
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
	}
	public void jouer() {
		System.out.println("c'est l'heure de jouer youpiii");
	}
	public void couiner() {
		System.out.println("s s s ....");
	}
}
