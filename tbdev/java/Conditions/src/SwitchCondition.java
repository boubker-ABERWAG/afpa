
public class SwitchCondition {

	public static void main(String[] args) {
		
		/*
		 * switch (variable) {
		 * 
		 * case valeur1:
		 *	 Traitement1;
		 *	 break;
		 * case valeur2 :
		 *	 Traitement2;
		 *	 break;
		 * case valeur3 : 
		 *	 Traitement3;
		 *	 break;
		 * default:
		 *	 TraitementParDefault;
		 *	 break;
		 * }
		 */
		
		int entier = 15 ;
		
		switch (entier) {
		case 10:
			System.out.println("La variable entier = 10");
			break;
		case 15 :
			System.out.println("La variable entier = 15");
			break;
		case 13 : 
			System.out.println("La variable entier = 13");
			break;
		default:
			System.out.println("Affichage par défaut");
			break;
		}
		
		String chaine = "Hello";
		switch (chaine) {
		case "Bonjour":
			System.out.println("Bonjour");
			break;
		case "Bonsoir" :
			System.out.println("Bonsoir");
			break;
		case "Hello" : 
			System.out.println("Hello");
			break;
		case "Coucou":
			System.out.println("Coucou");
			break;
		default:
			System.out.println("aucune des valeurs!");
			break;
		}
	}
}
