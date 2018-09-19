
public class Moyenne {

	public static void main(String[] args) {
		
		float moyenneTest = calculMoyene(15f, 13f, 1, 16, 1, 3, 5, 9);
		
		System.out.println("Moyenne test  : " + moyenneTest);
		
		float noteJava = 15f ; 
		float noteHtml = 13f ; 
		float noteJavascript = 9f ; 
		float noteCss = 8.5f ;

		int coefJava = 3 ; 
		int coefHtml = 2; 
		int coefJavascript = 3 ; 
		int coefCSs = 1;
		
		float moyenne = calculMoyene(noteJava, noteHtml, noteJavascript, noteCss, coefJava, coefHtml, coefJavascript, coefCSs);
		// moyenne = calculMoyene(14f, 13f, 9f, 8.5, 3, 2, 3, 1);

		// verifier la moyenne SI < 15 
		// on change la valeur des coefs 
		if(moyenne < 15) {
			coefJava = 1 ; 
			coefHtml = 3; 
			coefJavascript = 2 ; 
			coefCSs = 3;
			
			moyenne = calculMoyene(noteJava, noteHtml, noteJavascript, noteCss, coefJava, coefHtml, coefJavascript, coefCSs);
			// moyenne = calculMoyene(14f, 13f, 9f, 8.5, 1, 3, 2,3);
			
			affichage(moyenne);
		}
		// On calcule la moyenne  SI la moyenne < 10
		// on change les coefs 
		if(moyenne < 10) {
			coefJava = 3 ; 
			coefHtml = 3; 
			coefJavascript = 4 ; 
			coefCSs = 3;
			
			moyenne = calculMoyene(noteJava, noteHtml, noteJavascript, noteCss, coefJava, coefHtml, coefJavascript, coefCSs);

			affichage(moyenne);
		}
	}
	
	public static float calculMoyene(float noteJavaParam, float noteHtmlParam, float noteJavascriptParam, float noteCssParam, int coefJavaParam, int coefHtmlParam, int coefJavascriptParam, int coefCSsParam) {
		float moyenneARenvoyer = ((noteJavaParam * coefJavaParam ) 
				+ (noteHtmlParam * coefHtmlParam) 
				+ (noteJavascriptParam * coefJavascriptParam) 
				+ (noteCssParam * coefCSsParam)) 
				/ (coefJavaParam + coefHtmlParam + coefJavascriptParam + coefCSsParam);
		
		return moyenneARenvoyer;
	}
	
	public static void affichage(float moyenneATester) {
		if(moyenneATester > 18) {
			System.out.println("Très bien");
		}else if(moyenneATester > 15) {
			System.out.println("Bien");
		}else if(moyenneATester > 12) {
			System.out.println("Assez bien");
		}else if(moyenneATester > 10) {
			System.out.println("Moyen");
		}else if(moyenneATester > 8) {
			System.out.println("Il peut faire mieux");
		}else if(moyenneATester > 5) {
			System.out.println("Il faut plus de travail");
		}else {
			System.out.println("A l’année prochaine, même heure, même endroit ;)");
		}
	}

}
