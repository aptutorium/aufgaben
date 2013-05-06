package lebewesen;

public abstract class Tier extends Lebewesen {
	protected String name;
	
	@Override
	public String toString() {
		return "Ich hei§e " + this.name;
	}
}
