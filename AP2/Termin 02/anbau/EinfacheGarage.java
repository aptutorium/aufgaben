package anbau;

public class EinfacheGarage<T> {
	
	private T fahrzeug;
	
	public void parkeFahrzeug(T fahrzeug) {
		this.fahrzeug = fahrzeug;
	}
	
	public T getFahrzeug() {
		return this.fahrzeug;
	}
}
