
public class ExoWhileBoucle {

	public static void main(String[] args) {
		int nombreMin = 1 ;
		/*
		 * Afficher les nombres de 1 à 100
		 */
		System.out.println("Afficher les nombres de 1 à 100");
		while (nombreMin <= 100) {
			System.out.println(nombreMin);
			nombreMin++;
		}
		
		/*
		 * Afficher les nombres de 100 à 1 
		 */
		System.out.println("Afficher les nombres de 100 à 1");
		int nombreMax = 100;
		while (nombreMax <= 1 ) {
			System.out.println(nombreMax);
			nombreMax--;
		}
		
		int nombrePMin = 1;
		while (nombrePMin <= 100) {
			System.out.println(nombrePMin);
			nombrePMin++;
		}
		
		int nombrePMax = 100;
		while (nombrePMax >= 2 ) {
			System.out.println(nombrePMax);
			nombrePMax--;
		}
	}
}