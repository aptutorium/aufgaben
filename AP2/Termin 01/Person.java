
public class Person {

	private String name;
	private String nachname;
	private int alter;

	public Person(String name, String nachname, int alter) {
		this.name = name;
		this.nachname = nachname;
		this.alter = alter;
	}

	public int getAlter() {
		return this.alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	@Override
	public String toString() {
		return this.name + " " + this.nachname;
	}
}
