
public class TypesVariables {

	public static void main(String[] args) {
		
		// int
		int entier = 14 ;
		System.out.println("la variable entier = " + entier);
		
		//float
		float decimal = 12.5f;
		System.out.println("la variable decimal = " + decimal);
		
		// double
		double decimalDoublePrec = 15.5 ;
		System.out.println("la variable decimalDoublePrec = " + decimalDoublePrec);
		
		// boolean
		boolean bool = true;
		System.out.println("La variable bool = " + bool);
		
		// char
		char caractere = 'Z';
		System.out.println("La variable caractere = " + caractere);
		
		// String
		String chaine = "Hello";
		System.out.println("La variable chaine = " + chaine);
		
		
		// entier1
		int prix = 10;
		
		// entier2
		int tva = 20 ;
		
		System.out.println("prix * tva = " + (prix * tva));
		
		
		prix = 12 ;
		System.out.println("prix * tva = " + (prix * tva));
		
		tva = 21 ;
		System.out.println("prix * tva = " + (prix * tva));
		
		double tvaDouble = 19.6;		
		System.out.println("Prix * tvaDouble = " + (tvaDouble * prix));
		
		System.out.println("Bonjour " + "monsieur " + "," + "ça va" + "?" + 14);
		
		System.out.println(12 + 1 + 2 + 5 + 6 + 9);
		
		System.out.println("12" + "1" + "2" + "5" + "6" + "9");
		
		System.out.println("12" + 1 + 2 + 5 + 6 + 9);
		System.out.println("a!/*-+" + (1 + 2 + 5) + ("6" + 9));
		
		
		//Declaration et affectation
		// TYPE nomVariable = valeur ;
		int monInt = 12;
		double monDouble = 15.5;
		float monFloat = 12.6f;
		char monChar = 'a';
		boolean monBoolean = false ;
		String maChaine = "chaine";
		System.out.println("Declaration + affectation :");
		System.out.println("monInt = " + monInt);
		System.out.println("monDouble = " + monDouble);
		System.out.println("monFloat = " + monFloat);
		System.out.println("monChar = " + monChar);
		System.out.println("maChaine = " + maChaine);
		System.out.println("monBoolean = " + monBoolean);
		
		
		// Afectation 
		// nomVariable = valeur ;
		maChaine = "nouvelle chaine";
		monChar = 'Z';
		monBoolean = true;
		monDouble = 120.12;
		monInt = 1500;
		monFloat = 155.26f;
		System.out.println("Affectation :");
		System.out.println("monInt = " + monInt);
		System.out.println("monDouble = " + monDouble);
		System.out.println("monFloat = " + monFloat);
		System.out.println("monChar = " + monChar);
		System.out.println("maChaine = " + maChaine);
		System.out.println("monBoolean = " + monBoolean);
		
		// -1.7 * 10^308  -------- 1.7 * 10^308
		double d = 12.5555555555555;
		
		// float  -3.4 * 10^38 ------ 3.4 * 10^38
		float f  = 12.5555555555555f;
		
		System.out.println("d = " + d);
		System.out.println("f = " + f);
			
		
	}

}
