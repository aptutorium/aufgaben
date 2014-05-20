package lebewesen;

public class Hund extends Tier {
	
	private int alter;
	
	public Hund(int alter, String name) {
		this.alter = alter * 7;
		super.alter = alter;
		this.name = name;
	}
	
	public int getAlter() {
		return this.alter;
	}
	
	public int getAlterLebewesen() {
		return super.getAlter();
	}
	
	@Override
	public String toString() {
		return super.toString() + " Ich bin ein Hund!";
	}
	
}
