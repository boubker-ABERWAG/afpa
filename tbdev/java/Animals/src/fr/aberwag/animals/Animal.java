package fr.aberwag.animals;

public class Animal {
	
	protected String nom;
	protected int taille;
	protected int poids;
	protected String couleur;
	protected String race;
	
	public Animal() {
		System.out.println("Constructeur de la classe mère!" + this.race);
	}

	public Animal(String nom, int taille, int poids, String couleur, String race) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.couleur = couleur;
		this.race = race;
	}
	
	
	public void manger() {
		System.out.println("Miam, miam, c'est bon" + this.race);
	}
	public void dormir() {
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
	}
	public void jouer() {
		System.out.println("c'est l'heure de jouer youpiii");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

}