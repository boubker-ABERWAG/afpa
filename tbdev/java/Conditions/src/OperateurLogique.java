
public class OperateurLogique {

	public static void main(String[] args) {
		// ET  && 
		// OU  || 
		
		/*
		 * 2 variable noteJava et noteHtml
		 * SI la noteJava > 10 ET la noteHtml > 10
		 * ALORS Afficher "Bravo"
		 */
		
		float noteJava = 19f; 
		float noteHtml = 9;
		
		boolean noteJavaSup = noteJava > 10 ;
		System.out.println("noteJavaSup = " + noteJavaSup);
		
		boolean noteHtmlSup = noteHtml > 10 ;
		System.out.println("noteHtmlSup = " + noteHtmlSup);
		
		if(noteJavaSup && noteHtmlSup) {
			System.out.println("Bravo");
		}else {
			System.out.println("Au moins, une de vos conditions est fausse");
		}
		boolean resultatFinal = noteJavaSup || noteHtmlSup ;
		if(resultatFinal == true) {
			System.out.println("Vous avez eu une bonne note dans au moins une des matières (java ou html");
		}else {
			System.out.println("Vous avez eu une mauvaise note en java ET en html");
		}
	}
}
