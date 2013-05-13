
public class Main {

	public static void main(String[] args) 
	{
		// Ein Chirurg arbeitet immer im Krankenhaus -> siehe Konstruktor
		Chirurg einChirurg = new Chirurg();
	
		// Dieser Hausarzt macht Hausbesuche, arbeitet aber nicht im Krankenhaus
		Hausarzt einHausarzt = new Hausarzt(true, false);		
	}

}
