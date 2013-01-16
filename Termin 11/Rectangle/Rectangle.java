public class Rectangle {

	private double a;
	private double b;

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void setEdges(double a, double b) {
		if (a == 0 || b == 0) {
			System.out.println("Beide Seiten müssen größer 0 sein!");
			return; // Zur Vereinfachung - kein guter Programmierstil!
			// throw new IllegalArgumentException("Beide Seiten müssen größer 0 sein!");
		}
		this.a = a;
		this.b = b;
	}

	public double getArea() {
		return a * b;
	}

	public double getPerimeter() {
		return 2 * (a + b);
	}

	public Boolean isSquare() {
		return a == b;
	}

}
