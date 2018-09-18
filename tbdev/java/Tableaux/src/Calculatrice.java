import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre 1: ");
		// lecture clavier et affectationd e la valeur à la variable nombre1 
		int nombre1 = sc.nextInt();
		
		
		System.out.println("Veuillez choisir l'opération: ");
		// lecture clavier et affectation de la valeur à la variable operation  
		String operation = sc.next();
		System.out.println("Veuillez saisir un nombre: ");
		int nombre2 = sc.nextInt();
		// lecture clavier et affectationd e la valeur à la variable nombre

		int resultat = 0  ; 
		if(operation.equals("+")) {
			resultat = nombre1  + nombre2;
		}else if(operation.equals("-")) {
			resultat = nombre1  - nombre2;
		}else if(operation.equals("*")) {
			resultat = nombre1  * nombre2;
		}else if(operation.equals("/")) {
			resultat = nombre1  / nombre2;
		}
		System.out.println("résultat: " + nombre1 + " "+ operation + " " + nombre2 + " = " + resultat);
	}

}
