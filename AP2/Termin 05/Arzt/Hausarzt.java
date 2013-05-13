public class Hausarzt extends Arzt {
	
	public boolean machtHausbesuche;

	public Hausarzt(boolean machtHausbesuche, boolean arbeitetImKrankenhaus) {
		super(arbeitetImKrankenhaus);
		this.machtHausbesuche = machtHausbesuche;
	}

	public void ratGeben() {
		System.out.println("Ich gebe einen Ratschlag!");
	}
}
