package lebewesen;

public abstract class Lebewesen implements Comparable<Lebewesen> {
	
	protected int alter;
	
	public int getAlter() {
		return this.alter;
	}
	
	@Override
	public String toString() {
		return "Ich bin " + alter + " Jahre alt.";
	}
	
	@Override
	public int compareTo(Lebewesen that) {
		return (int)Math.signum(this.alter - that.alter);
	}
}
