
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Début du programme : ");
		Ville paris = new Ville();
		paris.nom = "Paris" ;
		paris.nombreHabitants = 100;
		paris.sup = 100;
		
		System.out.println("------------------------------------");
		
		System.out.println("Nom : " + paris.nom);
		System.out.println("Nombre d'habitants : " + paris.nombreHabitants);
		System.out.println("Sup : " + paris.sup);
		
		
		Ville marseille = new Ville();
		marseille.nom = "Marseille";
		marseille.nombreHabitants = 200 ;
		marseille.sup = 95 ;
		
		
		System.out.println("--------------------------------------");
		
		
		System.out.println("Nom : " + marseille.nom);
		System.out.println("Nombre d'ahbitants : " + marseille.nombreHabitants);
		System.out.println("Sup : " + marseille.sup);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Nom de la ville : " + paris.nom);
		System.out.println("---------------- Liverpool -----------------------");
		
		Ville liverpool = new Ville("Liverpool",500, 50);
		System.out.println("Nom : " + liverpool.nom);
		System.out.println("Nombre d'habitants : " + liverpool.nombreHabitants);
		System.out.println("Sup : " + liverpool.sup);
		
		System.out.println("-------------- lille -------------------------");
		
		
		Ville lille = new Ville("Lille", 400);
		System.out.println("Nom : " + lille.nom);
		System.out.println("Nombre d'habitants : " + lille.nombreHabitants);
		System.out.println("Sup : " + lille.sup);
		
		
		System.out.println("--------------- barcelone ------------------------");
		
		Ville barcelone = new Ville(750, 150);
		System.out.println("Nom : " + barcelone.nom);
		System.out.println("Nombre d'habitants : " + barcelone.nombreHabitants);
		System.out.println("Sup : " + barcelone.sup);
		
		System.out.println("--------------- Lumieres ------------------------");
		
		System.out.println("Lumiere : " + paris.etatLumiere);
		
		paris.allumerLesLumieres();
		System.out.println("Lumiere : " + paris.etatLumiere);
		
		
		
		
		
		
	}

}
