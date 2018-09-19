
public class Ville {
	
	public String nom ;
	public int nombreHabitants;
	public int sup;
	public boolean etatLumiere;
	
	//Constructeur sans Params
	public Ville() {}

	//constructeur avec params
	public Ville(String nomP, int nombreHabitantsP, int supP) {
		System.out.println("Constructeur avec params ");
		this.nom = nomP;
		nombreHabitants = nombreHabitantsP;
		sup = supP;	
	}

	public Ville(String nom, int nombreHabitants) {
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
	}

	public Ville(int nombreHabitants, int sup) {
		super();
		this.nombreHabitants = nombreHabitants;
		this.sup = sup;
	}
	
	public void allumerLesLumieres() {
		etatLumiere = true;
	}
	
	public void EteindreLesLumieres() {
		etatLumiere = false;
	}
	
}