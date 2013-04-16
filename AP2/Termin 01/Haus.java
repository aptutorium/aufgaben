
public class Haus {

	private double laenge;
	private double breite;
	private Person[] familie;


	public Haus(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}

	public double getFlaeche() {
		return laenge * breite;
	}

	public Person[] getPersonen() {
		return familie;
	}

	public void setPersonen(Person[] personen) {
		this.familie = personen;
	}

	public Person getAeltestePerson() {
		Person aeltestePerson =  this.familie[0];

		for (int i = 1; i < familie.length; i++) {
			if (this.familie[i].getAlter() > aeltestePerson.getAlter())
				aeltestePerson = this.familie[i];
		}
		return aeltestePerson;
	}

}
