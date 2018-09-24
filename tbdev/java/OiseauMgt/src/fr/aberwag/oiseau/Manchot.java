package fr.aberwag.oiseau;

public class Manchot extends Oiseau implements OIseauNageur {

	public Manchot() {
		super();
	}

	public Manchot(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
	}

	@Override
	public void nager() {
		System.out.println("Je nage!!");
	}
}
