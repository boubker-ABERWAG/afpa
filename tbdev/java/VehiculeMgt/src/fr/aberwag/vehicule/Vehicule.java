package fr.aberwag.vehicule;

public class Vehicule {

	protected String marque;
	protected String couleur;
	protected int puissance;
	protected int vitesse;
	protected int prix;
	protected int kilometrage;

	public Vehicule() {
		super();
	}

	public Vehicule(String marque, String couleur, int puissance, int vitesse, int prix, int kilometrage) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.puissance = puissance;
		this.vitesse = vitesse;
		this.prix = prix;
		this.kilometrage = kilometrage;
	}

	public void demarrer() {
		System.out.println("Démarrage");
	}

	public void accelerer() {
		System.out.println("Accéleration");
	}

	public void freiner() {
		System.out.println("je freine");
	}

	public void rouler() {
		System.out.println("Je roule!");
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

}
