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
		// Eine Garage fuer Verkehrsmittel anlegen
		Garage<Verkehrsmittel> meineGarage = new Garage<Verkehrsmittel>(2);
		
		// Zwei Objekte anlegen, die das Interface implementieren
		Auto meinAuto = new Auto();
		Motorrad meinMotorrad = new Motorrad();
		
		// Auto und Motorrad in der Garage parken
		meineGarage.parkeFahrzeug(meinAuto);
		meineGarage.parkeFahrzeug(meinMotorrad);
		
		// Alle Fahrzeuge ausgeben
		while (!meineGarage.istLeer()) {
			System.out.println(meineGarage.getFahrzeug());
		}
		
	}

}
