
public class MainChanson {

	public static void main(String[] args) {
		Chanson ch1 = new Chanson();
		System.out.println("Titre : " + ch1.getTitre());
		// Modification de la prop titre de l'objet ch1
		ch1.setTitre("titre de ma chanson");
		// ch1.titre = "titre de ma chanson"
		System.out.println("Titre : " + ch1.getTitre());
		
		System.out.println("Artiste : " + ch1.getArtiste());
		// Modification de la prop artiste de l'objet ch1
		ch1.setArtiste("Un artiste inconnu");
		System.out.println("Artiste : " + ch1.getArtiste());
		
		System.out.println("Durée : " + ch1.getDuree());
		// Modification de la prop duree de l'objet ch1
		ch1.setDuree("5");
		System.out.println("Durée : " + ch1.getDuree());
		
		System.out.println(
						"L'artiste " 
						+ ch1.getArtiste() +
						" a une chanson qui se nomme " 
						+ ch1.getTitre() 
						+ " et qui dure " + ch1.getDuree() 
						+ " min");
		

	}

}
