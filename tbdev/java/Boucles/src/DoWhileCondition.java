
public class DoWhileCondition {

	public static void main(String[] args) {
		int a = 10 ;
		while(a < 2) {
			System.out.println("Bonjour");
		}
		
		do {
			System.out.println("Bonsoir");
		} while (a < 2);
		
		System.out.println("FIN");
		
		int numeroChoisiParLaMachine = 90;
		int votreNumero = 90;
		do {
			System.out.println("Veuillez enter un numéro svp:" + votreNumero);
			votreNumero++;
			
		} while (votreNumero != numeroChoisiParLaMachine);
		
		votreNumero = 90;
		while(votreNumero != numeroChoisiParLaMachine) {
			System.out.println("Veuillez enter un numéro svp:" + votreNumero);
			votreNumero++;
		}
		System.out.println("Votre num = " + votreNumero);
			
	}

}
