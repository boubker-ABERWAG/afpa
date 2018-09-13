
public class ForBoucle {

	public static void main(String[] args) {
		int nombreMin = 1 ;
		/*
		 * Afficher les nombres de 1 à 100
		 */
//		System.out.println("Afficher les nombres de 1 à 100");
//		while (nombreMin <= 100) {
//			System.out.println(nombreMin);
//			nombreMin++;
//		}
		
		/*
		 * Déclaration et affectation de la variable nombre
		 * condition
		 * traitement
		 * Inrémenter la variable 
		 * condition
		 * traitement
		 * Inrémenter la variable 
		 * condition
		 * traitement
		 * Inrémenter la variable 
		 * condition
		 */
		
		/*
		 * int nombre = 1 ;
		 * nombre <= 100;
		 * System.out.println(nombre);
		 * nombre++;
		 * nombre <= 100;
		 * System.out.println(nombre);
		 * nombre++;
		 * nombre <= 100;
		 * .....
		 */
		for (int nombre = 1; nombre <= 100; nombre = nombre + 45) {
			System.out.println(nombre);
		}
		System.out.println("Fin du traitement");

	}

}
