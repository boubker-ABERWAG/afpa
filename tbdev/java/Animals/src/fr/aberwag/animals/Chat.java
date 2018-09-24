package fr.aberwag.animals;

public class Chat extends Animal{
	
	private String couleurDesYeux;
	private String jeuPref = "foot" ;
	
	public Chat() {}
	public Chat(String nom, int taille, int poids, String couleur, String race) {
		super(nom, taille, poids, couleur, race);
	}
	
	
	public void miauler() {
		System.out.println("Miaow Miaow Miaow ....");
	}
	public void griffer() {
		System.out.println("bien fait pour toi la prochaine fois tu réflichiras avant de prendre ma gamelle miaow");
	}
	
	
	public String getJeuPref() {
		return jeuPref;
	}
	public void setJeuPref(String jeuPref) {
		if("".equals(jeuPref)) {
			System.out.println("Veuillez saisir un nom de jeu svp");
		}else {
			this.jeuPref = jeuPref;
		}
	}
}
