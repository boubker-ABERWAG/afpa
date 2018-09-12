
public class IfElseifElseCondition {

	public static void main(String[] args) {
		
		/*
		 * LA condition IF ELSE IF ELSE 
		 * if(condition1) {
		 * 		traitement1;
		 * } else if (condition2){
		 * 		traitement2;
		 * }else if(conditionN){
		 * 		traitementN;
		 * }else{
		 * 		(traitement dans le cas ou aucune condition n'est valide);
		 * }
		 */
		// déclaration
		int nombre;
		// affectation 
		nombre = 16 ;
		
		/* Déclaration + affectation 
		 * int note = 10;
		 * 
		 */
		
		if(nombre > 15) {
			System.out.println("Le nombre est >= 15");
		}else if (nombre > 10) {
			System.out.println("Le nombre est > 10" );
		}else if(nombre == 10) {
			System.out.println("Le nombre est = 10");
		}else{
			System.out.println("Le nombre est < 10");
		}
	}
}
