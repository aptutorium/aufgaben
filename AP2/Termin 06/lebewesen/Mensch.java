package lebewesen;

public final class Mensch extends Lebewesen {
	
	private String vorname;
	private String nachname;
	
	public Mensch(int alter, String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}

	@Override
	public String toString() {
		return super.toString() + " Mein Name ist " + this.vorname + " " + this.nachname;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Mensch);
	}
}
