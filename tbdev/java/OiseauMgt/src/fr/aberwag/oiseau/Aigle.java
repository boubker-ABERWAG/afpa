package fr.aberwag.oiseau;

public class Aigle extends Oiseau implements OiseauVolant {

	public Aigle() {
		super();
	}

	public Aigle(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
	}

	public void chasser(String nom) {
		System.out.println("Je chsse un " + nom);
	}

	@Override
	public void voler() {
		System.out.println("Je vole");
	}
}
