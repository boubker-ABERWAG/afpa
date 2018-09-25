package fr.aberwag.vehicule;

public class Voiture extends Vehicule {

	private int nombreDePortes;

	public Voiture() {
		super();
	}

	public Voiture(String marque, String couleur, int puissance, int vitesse, int prix, int kilometrage,
			int nombreDePortes) {
		super(marque, couleur, puissance, vitesse, prix, kilometrage);
		this.nombreDePortes = nombreDePortes;
	}

	public int getNombreDePortes() {
		return nombreDePortes;
	}

	public void setNombreDePortes(int nombreDePortes) {
		this.nombreDePortes = nombreDePortes;
	}
}
