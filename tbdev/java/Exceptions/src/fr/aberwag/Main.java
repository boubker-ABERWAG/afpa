package fr.aberwag;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println("le résultat de la division de " + a + "  par " + b + " = " + a / b);
		} catch (Exception e) {
			System.out.println("Impossible de diviser par 0");
		}

		System.out.println("Fin du programme");

	}

}
