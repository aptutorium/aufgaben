package anbau;

public class Motorrad implements Verkehrsmittel{
	
	private boolean motorLaeuft;
	
	@Override
	public String toString() {
		return "Motorrad";
	}

	@Override
	public void starteMotor() {
		this.motorLaeuft = true;
	}

	@Override
	public void stoppeMotor() {
		this.motorLaeuft = false;
	}

	@Override
	public boolean motorLaeuft() {
		return this.motorLaeuft;
	}

	@Override
	public int anzahlReifen() {
		return 2;
	}
}
