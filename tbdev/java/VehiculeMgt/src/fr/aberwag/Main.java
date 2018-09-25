package fr.aberwag;

import fr.aberwag.vehicule.Camion;

public class Main {

	public static void main(String[] args) {
		Camion volvo = new Camion("Volvo", "Rouge", 120, 200, 100000, 5000, 20);
// 1st Solution 
//		if (volvo.getCapacite() < 25) {
//			System.out.println("================ Mercedes=========================");
//			Camion mercedes = new Camion("Mercedes", "Blanc", 300, 200, 150000, 0, 30);
//			mercedes.demarrer();
//			mercedes.accelerer();
//			mercedes.rouler();
//		} else {
//			System.out.println("================ Volvo =========================");
//			volvo.demarrer();
//			volvo.accelerer();
//			volvo.rouler();
//		}

		// 2nd solution
//		Camion mercedes = null;
//		if (volvo.getCapacite() < 25) {
//			mercedes = new Camion("Mercedes", "Blanc", 300, 200, 150000, 0, 30);
//		}
//		mercedes.demarrer();
//		try {
//			mercedes.demarrer();
//			mercedes.accelerer();
//			mercedes.rouler();
//		} catch (Exception e) {
//			System.out.println("================= Volovo =============================");
//			volvo.demarrer();
//			volvo.accelerer();
//			volvo.rouler();
//		}

		//
		Camion mercedes = null;

		if (volvo.getCapacite() < 25) {
			mercedes = new Camion("Mercedes", "Blanc", 300, 200, 150000, 0, 18);
		}

		if (mercedes != null) {
			System.out.println("================= Mercedes =============================");
			mercedes.demarrer();
			mercedes.accelerer();
			mercedes.rouler();
		} else {
			System.out.println("================= Volovo =============================");
			volvo.demarrer();
			volvo.accelerer();
			volvo.rouler();
		}
	}
}