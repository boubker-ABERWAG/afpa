
public class OpTernaireCondition {

	public static void main(String[] args) {
		int entier = 1;
		
		int i = 10 * 100 * entier; // resultat 1000
		System.out.println("i = " + i);
		
		String chaine = "a"+"bc"+"def"; // resultat abcdef
		System.out.println("chaine = " + chaine);
		
		boolean b = (i == 10);
		System.out.println(b);
		
//		if(b) {
//			entier = 100;
//		}else {
//			entier  = 222 ;
//		}
		entier = (b ? 100 : 222) ;
		
		System.out.println(entier);
		
	}
}
