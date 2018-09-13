
public class ExoOperateurLogique {

	public static void main(String[] args) {
		float noteJava = 14f ; 
		float noteHtml = 13f ; 
		float noteJavascript = 9f ; 
		float noteCss = 8.5f ;
		
		
		int coefJava = 3 ; 
		int coefHtml = 2; 
		int coefJavascript = 3 ; 
		int coefCSs = 1;
		float moyenne = noteJava + noteHtml + noteJavascript + noteCss;
		float moyenneGenerale = ((noteJava * coefJava ) 
				+ (noteHtml * coefHtml) 
				+ (noteJavascript * coefJavascript) 
				+ (noteCss * coefCSs)) 
					/ (coefJava + coefHtml + coefJavascript + coefCSs);
		
		if(moyenne > 10 || moyenneGenerale > 10) {
			System.out.println("Vous avez la moyenne");
		}
		if(moyenne > 10 && noteJava > 10) {
			System.out.println("Vous avez eu la moyenne et une bonne note en java");
		}
		if(noteCss > 10 || noteHtml > 10 || noteJavascript > 10) {
			System.out.println("Vous avez eu une bonne note en html ou Css ou Javascript");
		}
		
		if(noteCss > 10 && noteHtml > 10 && noteJavascript > 10) {
			System.out.println("Vous avez eu une bonne note en html, Css ET Javascript");
		}
		
		if(noteJava > 15 && noteJava > 15) {
			System.out.println("Vous avez eu une très bonne note een Java et Javascript");
		}
		
		if(moyenne < 10 && moyenneGenerale < 10) {
			System.out.println("Vous n'avez pas eu la moyenne");
		}
		
		if(noteJava < 5 || noteJavascript < 5  || noteCss < 5 || noteHtml < 5 ) {
			System.out.println("Vous devez travailler sérieusement une des quatre matièeres");
		}
	}

}
