
public class Tests {

	public static void main(String[] args) {
		int note = 15 ; 
		
		boolean bo = note > 100 ;
		
		boolean bool = bo || note > 10;
		// boolean bool = bo || true;
		// boolean bool = false || true
		// boolean bool = true
		
		System.out.println("La variable bo = " + bo);
		if(bo) {
			System.out.println("La condition est vraie");
		}else {
			System.out.println("la condition est fausse");
		}
	}
}
