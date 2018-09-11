
public class ExoConditionIf {

	public static void main(String[] args) {
		
		/*
		 * Les conditions IF
		 * if(condition){
		 * 		traitement;
		 * }
		 */
		
		float note = 15f;
		int coef = 3 ;
		float resultat = note * coef ; 
		if(resultat >= 50) {
			System.out.println("Resultat = " + resultat);
		}
		
		if(resultat < 50) {
			System.out.println("resultat insuffisant");
		}
		
		float noteJava = 10.5f ; 
		float noteHtml = 13.5f ; 
		float noteJavascript = 9.5f ; 
		float noteCss = 8.5f ;
		
		float moyenne = (noteJava + noteHtml + noteJavascript + noteCss) / 4; 
		
		if(moyenne >= 10) {
			System.out.println("Vous avez eu une bonne note");
		}
		if(moyenne < 10) {
			System.out.println("Vous avez eu une mauvaise note");
		}
	}
}
