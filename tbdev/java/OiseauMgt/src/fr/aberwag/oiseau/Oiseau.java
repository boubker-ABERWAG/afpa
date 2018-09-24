package fr.aberwag.oiseau;

public class Oiseau {
	protected String nom;
	protected int taille;
	protected int poids;
	protected String race;
	protected boolean plumes;

	public Oiseau() {
		super();
	}

	public Oiseau(String nom, int taille, int poids, String race, boolean plumes) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.race = race;
		this.plumes = plumes;
	}

	public void manger() {
		System.out.println("Miam, miam");

	}

	public void boire() {
		System.out.println("Je bois");
	}

	public void jouer() {
		System.out.println("Je joue");
	}

	public void courir() {
		System.out.println("Je cours");
	}

	public void sauter() {
		System.out.println("Je saute");
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

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public boolean isPlumes() {
		return plumes;
	}

	public void setPlumes(boolean plumes) {
		this.plumes = plumes;
	}
}
