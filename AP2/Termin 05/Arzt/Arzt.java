public abstract class Arzt {
	
	protected boolean arbeitetImKrankenhaus;
	
	public Arzt(Boolean arbeitetImKrankenhaus) {
		this.arbeitetImKrankenhaus = arbeitetImKrankenhaus;
	}
	
	public void patientBehandeln() {
		System.out.println("Ich untersuche den Patienten!");
	}
}
