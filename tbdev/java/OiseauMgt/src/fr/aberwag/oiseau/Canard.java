package fr.aberwag.oiseau;

public class Canard extends Oiseau implements OIseauNageur, OiseauVolant {

	public Canard() {
		super();
	}

	public Canard(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
	}

	@Override
	public void voler() {
		System.out.println("Js suis un canard qui aime bien nager!!!!!!!");
	}

	@Override
	public void nager() {
		System.out.println("JE susi un canard qui n'aime pas voler, mais je sais voler");
	}
}
