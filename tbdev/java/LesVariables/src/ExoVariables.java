public class ExoVariables {
	
	public static void main(String[] args) {
		
		float note = 14.5f ;
		int coef = 3 ; 
		float resultat = note * coef;
		System.out.println("Resultat = " + resultat);
		
		note = 12.3f;
		coef = 5; 
		resultat = note * coef ; 
		System.out.println("Resultat = " + resultat);
		
		
		float noteJava = 10.5f ; 
		float noteHtml = 13.2f ; 
		float noteJavascript = 11.3f ; 
		float noteCss = 8.5f ;
		
		float moyenne = (noteJava + noteHtml + noteJavascript + noteCss) / 4; 
		System.out.println("La moyenne : " + moyenne);
		
		int coefJava = 3 ; 
		int coefHtml = 2; 
		int coefJavascript = 3 ; 
		int coefCSs = 1;
		
		moyenne = ((noteJava * coefJava ) 
				+ (noteHtml * coefHtml) 
				+ (noteJavascript * coefJavascript) 
				+ (noteCss * coefCSs)) 
					/ (coefJava + coefHtml + coefJavascript + coefCSs);
		
		System.out.println("La moyenne : " + moyenne);
		
		// déclaration 
		// [type] [nomDeLaVariable];
		int quantite;
		// Affectation
		// [nomDeLaVariable] = [LaVAleur];
		quantite = 100 ;
		
		// Déclaration + Affectation 
		// [type] [nomDeLaVariable] = [LaVAleur];
		int variable = 123;
		
		
	}
}