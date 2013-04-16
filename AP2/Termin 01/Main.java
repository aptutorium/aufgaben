
public class Main {

	public static void main(String[] args) {
		Haus haus = new Haus(5, 4);
		System.out.println("Das Haus ist " + haus.getFlaeche() + " gro§");
		Person[] familie = new Person[3];

		familie[0] = new Person("peter", "mueller", 38);
		familie[1] = new Person("hilde", "mueller", 30);
		familie[2] = new Person("franz", "mueller", 18);

		haus.setPersonen(familie);
		Person aeltestePerson = haus.getAeltestePerson();

		System.out.println("Der aelteste ist " + aeltestePerson);
	}

}
