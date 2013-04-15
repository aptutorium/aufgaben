public class Main {

	public static void main(String[] args) {
		double flaeche;
		Circle meinKreis = new Circle(10);
		
		flaeche = meinKreis.getArea();
		
		System.out.printf("Die Flaeche betraegt: %.2f", flaeche);
	}
}