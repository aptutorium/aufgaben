package bruch;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=============================================");
		Bruch b1 = new Bruch(50, 100);
		Bruch b2 = new Bruch(1, 2);
		
		Bruch summe = b1.addiere(b2);
		Bruch differenz = b1.subtrahiere(b2);
		Bruch produkt = b1.multipliziere(b2);
		Bruch quotient = b1.dividiere(b2);
		
		System.out.println(b1 + " + " + b2 + " = " + summe + " = " + summe.dezimal());
		System.out.println(b1 + " - " + b2 + " = " + differenz + " = " + differenz.dezimal());
		System.out.println(b1 + " * " + b2 + " = " + produkt + " = " + produkt.dezimal());
		System.out.println(b1 + " / " + b2 + " = " + quotient + " = " + quotient.dezimal());
		
		System.out.println("============================================");
		switch (b1.compareTo(b2)) {
		case 0:
			System.out.println(b1 + " == " + b2);
			break;
		case 1:
			System.out.println(b1 + " > " + b2);
			break;
		case 2:
			System.out.println(b1 + " < " + b2);
			break;
		}
		
		System.out.println("============================================");
		if (b1.equals(b2)) {
			System.out.println("b1 und b2 sind gleich");
		} else{
			System.out.println("b1 und b2 sind ungleich");
		}
		
		System.out.println("============================================");
		try {
			new Bruch(1, 0);
		} catch (ArithmeticException e) {
			System.out.println("Eine Division durch Null ist nicht moeglich!");
		}
	}

}
