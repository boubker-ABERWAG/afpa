public class ExoConditionIfElse {
	public static void main(String[] args) {
		String cnx = "connection";
		if(cnx == "connection") {
			System.out.println("Vous êtes connecté");
		}else {
			System.out.println("Vous n'êtes pas connecté");
		}
		
		char caractere = 'a';
		if(caractere == 'a') {
			System.out.println("Le caractère = 'a'");
		}else {
			System.out.println("Le caractère != 'a'");
		}
	}
}