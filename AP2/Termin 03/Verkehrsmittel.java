package anbau;

public interface Verkehrsmittel {
	public void starteMotor();
	public void stoppeMotor();
	public boolean motorLaeuft();
	public int anzahlReifen();
}
