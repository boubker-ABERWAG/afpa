
public class ExoTableau1D {

	public static void main(String[] args) {
		//
		int [] entiersPremiers = {2, 3, 5, 7, 11, 13, 17, 19, 23};
		
		int recherche = 23;
		
		boolean existe = false;
		
		for (int i = 0; i < entiersPremiers.length; i++) {
			if(recherche == entiersPremiers[i]) {
				/*
				 * Si le nombre recherché est égal a une des valeurs dans le tableau 
				 * Je change la valeur du boolean existe en true 
				 */
				existe = true;
			}
		}
		
		/*
		 * recherche = 14 
		 * la valur de existe = false ;
		 */
		
		/*
		 * Si la valeur n'existe pas dans le tableau 
		 * j'affiche le message le nombre n'existe pas 
		 */
		if(existe) {
			System.out.println("Le nombre " + recherche + " Existe dans le tableau");
		}else {
			System.out.println("Le nombre " + recherche + " n'Existe dans le tableau");
		}
		
		
		

	}

}
