package shapes;

public class Square implements Shape {

	private double sideLength;
	
	public Square(double sideLength) {
		this.sideLength = sideLength;
	}
	
	@Override
	public double getPerimeter() {
		return sideLength * 4;
	}

	@Override
	public double getArea() {
		return sideLength * sideLength;
	}

	@Override
	public int compareTo(Shape that) {
		if (this.getArea() == that.getArea()) return 0;
		return this.getArea() > that.getArea() ? 1 : -1;
	}
}
