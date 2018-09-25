package fr.aberwag.vehicule;

public class Camion extends Vehicule {

	private int capacite;

	public Camion() {
		super();
	}

	public Camion(String marque, String couleur, int puissance, int vitesse, int prix, int kilometrage, int capacite) {
		super(marque, couleur, puissance, vitesse, prix, kilometrage);
		this.capacite = capacite;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
}
