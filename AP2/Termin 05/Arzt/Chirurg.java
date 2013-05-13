public class Chirurg extends Arzt {
	
	public Chirurg() {
		super(true);
	}
	
	public void patientBehandeln() {
		System.out.println("Ich operiere den Patienten");
	}
	
	public void schneiden() {
		System.out.println("x---------x");
	}
}
