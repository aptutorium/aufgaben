package testumgebung;

// Alle Lebewesen bekannt machen
import lebewesen.*;

public class Main {
	
	public static void main(String[] args) 
	{	
		// Wir legen uns drei Lebewesen an
		Hund einHund = new Hund(10, "Rex");;
		Vogel einVogel = new Vogel(2, "Barney");
		Mensch einMensch = new Mensch("Tony", "Soprano", 55);
		
		// In dieses array kann ich nur Tiere speichen
		Tier[] tierpark = new Tier[2];
		tierpark[0] = einHund;
		tierpark[1] = einVogel;
		
		// Hier koennen alle Lebewesen gespeichert werden
		Lebewesen[] planetErde = new Lebewesen[3];
		planetErde[0] = einHund;
		planetErde[1] = einVogel;
		planetErde[2] = einMensch;
		
		/*
		 * Das Array planetErde wird Ÿber eine For-Each-Schleife durchlaufen.
		 * In jedem Durchlauf wird das aktuelle Element in die Variable
		 * aktuellesLebewesen gespeichert.   
		 */
		for (Lebewesen aktuellesLebewesen : planetErde) {
			/*
			 * ZunŠchst beschreibt sich jedes Lebewesen selbst --> toString()
			 * Das Alter wird Ÿber getAlter() abgefragt. Das ist mšglich, da jedes
			 * Lebewesen (Mensch, Vogel, Hund) diese Methode geerbt hat.
			 */
			System.out.println(aktuellesLebewesen + ". Ich bin " + aktuellesLebewesen.getAlter() + " Jahre alt");
		}
	}
	
}
