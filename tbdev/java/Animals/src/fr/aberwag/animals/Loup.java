package fr.aberwag.animals;

public class Loup extends Animal {
	

	public Loup() {
		super();
	}
	public Loup(String nom, int taille, int poids, String couleur, String race) {
		super(nom, taille, poids, couleur, race);
	}
	

	public void hurler() {
		System.out.println("hooooo hoooo hoooo ....");
	}
	public void mordre() {
		System.out.println("bien fait pour toi la prochaine fois tu réflichiras avant venir chez moi!!!!!");
	}
}
