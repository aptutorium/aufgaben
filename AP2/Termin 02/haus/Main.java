package haus;

public class Main {

	public static void main(String[] args) {
		
		// Haus fuer Personen
		Haus<Person> haus = new Haus<Person>(5, 4);
		
		Person[] familie = new Person[4];
		familie[0] = new Person("Peter", "Mueller", 38);
		familie[1] = new Person("Hilde", "Mueller", 30);
		
		haus.setBewohner(familie);
		
		// Haus fuer Tiere
		Haus<Tier> hausFuerTiere = new Haus<Tier>(5, 4);
		
		Tier[] tiere = new Tier[4];
		tiere[0] = new Tier("Jaro", 13);
		tiere[1] = new Tier("Rex", 7);
		
		hausFuerTiere.setBewohner(tiere);
	}

}
