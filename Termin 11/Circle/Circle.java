public class Circle {
	
	private final double PI = 3.14;
	private double radius;
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double flaeche = PI * radius * radius;
		return flaeche;
	}
}