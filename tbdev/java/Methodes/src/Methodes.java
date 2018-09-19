

public class Methodes {
	//	public static typeDeRetour nomDeLaMethode(args....){
	//	}
	public static void main(String[] args) {
		System.out.println("Addition");
		int addition1215 = addition(12, 15);
		System.out.println(addition1215);

		int addition1516 = addition(15, 16);
		System.out.println(addition1516);

		int addition2533 = addition(25, 33);
		System.out.println(addition2533);

		// soustraction 
		System.out.println("Soustraction");
		int soustraction1215 = multiplication(12, 15);
		System.out.println(soustraction1215);

		int soustraction1516 = multiplication(15, 16);
		System.out.println(soustraction1516);

		int soustraction2533 = multiplication(25, 33);
		System.out.println(soustraction2533);

		// multiplication 
		System.out.println("multiplication");
		int multiplication1215 = multiplication(12, 15);
		System.out.println(multiplication1215);

		int multiplication1516 = multiplication(15, 16);
		System.out.println(multiplication1516);

		int multiplication2533 = multiplication(25, 33);
		System.out.println(multiplication2533);

		// division 
		System.out.println("division");
		int division1215 = division(12, 15);
		System.out.println(division1215);

		int division1516 = division(15, 16);
		System.out.println(division1516);

		int division2533 = division(25, 33);
		System.out.println(division2533);

	}

	public static int multiplication(int i, int j) {
		int result = i * j;
		return result;
	}
	
	public static int division(int i, int j) {
		int result = i / j;
		return result;
	}

	/*
	 * Déclaration de la méthode addition
	 */
	public static int addition(int nombre1, int nombre2) {
		int resultat = nombre1 + nombre2;
		return resultat;
	}

	/*
	 * Déclaration de la méthode soustraction
	 */
	public static int soustraction(int nombre1, int nombre2) {
		int resultat = nombre1 - nombre2;
		return resultat;
	}
}
