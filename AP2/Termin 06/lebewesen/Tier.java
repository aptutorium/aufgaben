package lebewesen;

public abstract class Tier extends Lebewesen {
	
	protected String name;
	
	@Override
	public String toString() {
		return super.toString() + " Mein Name ist " + this.name + ".";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Tier) {
			Tier zuVergleichendesTier = (Tier)obj;
			return this.name.equals(zuVergleichendesTier.name) && this.alter == zuVergleichendesTier.alter;
		}
		return false;
	}
}
