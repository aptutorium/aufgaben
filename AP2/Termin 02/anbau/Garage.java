package anbau;

public class Garage<T> {
	
	private T[] fahrzeuge;
	private int geparkteFahrzeuge;
	
	@SuppressWarnings("unchecked")
	public Garage(int anzahlFahrzeuge) {
		this.fahrzeuge = (T[]) new Object[anzahlFahrzeuge];
		this.geparkteFahrzeuge = 0;
	}
	
	public void parkeFahrzeug(T fahrzeug) {
		this.fahrzeuge[geparkteFahrzeuge++] = fahrzeug;
	}
	
	public T getFahrzeug() {
		return this.fahrzeuge[--geparkteFahrzeuge];
	}
	
	@SuppressWarnings("unchecked")
	public void leereGarage() {
		this.fahrzeuge = (T[]) new Object[this.fahrzeuge.length];
		this.geparkteFahrzeuge = 0;
	}
	
	public boolean istLeer() {
		return geparkteFahrzeuge == 0;
	}
	
	public int getAnzahlFahrzeuge() {
		return this.geparkteFahrzeuge;
	}
	
	// Hier testen wir unsere Klasse
	public static void main(String[] args) {
		// Eine Garage fuer Autos anlegen
		Garage<Auto> autoGarage = new Garage<Auto>(2);
		
		// Zwei Autos anlegen
		Auto meinErstesAuto = new Auto();
		Auto meinZweitesAuto = new Auto();
		
		// Beide Autos in der Garage parken
		autoGarage.parkeFahrzeug(meinErstesAuto);
		autoGarage.parkeFahrzeug(meinZweitesAuto);
		
		// Alle geparkten Autos in die Konsole ausgeben
		System.out.println("Hier parken " + autoGarage.getAnzahlFahrzeuge() + " Fahrzeuge:");
		while (!autoGarage.istLeer()) {
			System.out.println("--> " + autoGarage.getFahrzeug());
		}
		
	}

}
