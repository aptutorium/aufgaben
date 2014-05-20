package lebewesen;

public class Vogel extends Tier implements Fluegel {
	
	public Vogel(int alter, String name) {
		this.alter = alter;
		this.name = name;
	}
	
	@Override
	public void fliegen() {
		System.out.println("Ich kann fliegen!");
	}
	
	@Override
	public String toString() {
		return super.toString() + " Ich bin ein Vogel!";
	}
}
