package lebewesen;

public class Main {

	public static void main(String[] args) {
		Hund einHund = new Hund(10, "Rex");
		Vogel einVogel = new Vogel(2, "Tweety");
		Mensch einMensch = new Mensch(55, "Martin", "Odersky");
		
		// Aufgabe 1
		System.out.println(einHund);
		System.out.println(einVogel);
		System.out.println(einMensch);
		
		// Aufgabe 2
		System.out.println("=============================================");
		
		Vogel gleicherVogel = new Vogel(2, "Tweety");
		
		if (einVogel.compareTo(gleicherVogel) == 0) {
			System.out.println("Die Všgel sind gleich alt!");
		}
		
		if (einVogel.compareTo(einHund) == -1) {
			System.out.println("Der Hund ist Šlter");
		}
		
		// Aufgabe 3
		System.out.println("=============================================");
		
		if (einVogel.equals(gleicherVogel)) {
			System.out.println("Die Všgel haben das gleiche Alter und den gleichen Namen");
		}
		
		if (!einHund.equals(einMensch)) {
			System.out.println("Hund und Mensch sind nicht gleich");
		}
		
		if (!einHund.equals(null)) {
			System.out.println("Ein Vergleich mit null sollte auch mšglich sein!");
		}
	}

}
