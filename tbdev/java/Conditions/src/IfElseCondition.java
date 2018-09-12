
public class IfElseCondition {

	public static void main(String[] args) {
		
		/*
		 * La condition IF ELSE 
		 * if(condition){
		 * 		traitement1;
		 * } else{
		 * 		traitement2;
		 * }
		 */
		int moyenne = 10;
		if(moyenne >= 10) {
			System.out.println("Vous avez eu une bonne moyenne");
		}
		
		if(moyenne <= 10) {
			System.out.println("Vous avez eu une mauvaise moyenne");
		}
		
		int note = 10 ;
		if(note >= 10) {
			System.out.println("======> Vous avez eu une bonne note");
		}else {
			System.out.println("Vous avez eu une mauvaise note");
		}
		
		
		float notes = 15f;
		int coef = 3 ;
		float resultat = notes * coef ; 
		
		if(resultat >= 50) {
			System.out.println("Resultat = " + resultat);
		}else {
			System.out.println("resultat insuffisant");	
		}	
	}

}
