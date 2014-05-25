package bruch;

public class Bruch implements Comparable<Bruch> {

	private int zaehler;
	private int nenner;
	
	public Bruch(int zaehler, int nenner) {
		if (nenner == 0) throw new ArithmeticException();
		
		int ggt = this.ggt(zaehler, nenner);
		
		this.zaehler = zaehler / ggt;
		this.nenner = nenner / ggt;
	}
	
	public Bruch dividiere(Bruch that) {
		return new Bruch(this.zaehler * that.nenner, this.nenner * that.zaehler);
	}
	
	public Bruch multipliziere(Bruch that) {
		return new Bruch(this.zaehler * that.zaehler, this.nenner * that.nenner);
	}
	
	public Bruch addiere(Bruch that) {
		return new Bruch( (this.zaehler * that.nenner) + (that.zaehler * this.nenner), (this.nenner * that.nenner) );
	}
	
	public Bruch subtrahiere(Bruch that) {
		return new Bruch( (this.zaehler * that.nenner) - (that.zaehler * this.nenner), (this.nenner * that.nenner) );
	}
	
	public double dezimal() {
		return (double) this.zaehler / (double) this.nenner;
	}
	
	// Nuetzliche Methoden von Object ueberschreiben
	
	@Override
	public String toString() {
		return this.zaehler + "/" + this.nenner;
	}
	
	@Override
	public boolean equals(Object that) {
		if (that == null || !(that instanceof Bruch)) return false;
		Bruch zuVergleichenderBruch = (Bruch)that;
		return this.zaehler == zuVergleichenderBruch.zaehler && this.nenner == zuVergleichenderBruch.nenner;
	}
	
	// Comparable
	
	@Override
	public int compareTo(Bruch that) {
		return (int) Math.signum(this.subtrahiere(that).dezimal());
	}
	
	// Private Hilfsmethoden
	
	private int ggt(final int zaehler, final int nenner) {
		if (nenner == 0) return zaehler;
		else return ggt(nenner, zaehler % nenner);
	}
	
	// Getter und Setter
	
	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}
}
