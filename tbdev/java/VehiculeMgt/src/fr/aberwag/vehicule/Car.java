package fr.aberwag.vehicule;

public class Car extends Vehicule {

	private int nombreDePlaces;

	public Car() {
		super();
	}

	public Car(String marque, String couleur, int puissance, int vitesse, int prix, int kilometrage,
			int nombreDePlaces) {
		super(marque, couleur, puissance, vitesse, prix, kilometrage);
		this.nombreDePlaces = nombreDePlaces;
	}

	public int getNombreDePlaces() {
		return nombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}
}
