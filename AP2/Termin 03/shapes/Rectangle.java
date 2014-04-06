package shapes;

public class Rectangle implements Shape {

	private double sideALength;
	private double sideBLength;
	
	public Rectangle(double sideALength, double sideBLength) {
		this.sideALength = sideALength;
		this.sideBLength = sideBLength;
	}
	
	@Override
	public double getPerimeter() {
		return (2 * sideALength) + (2 * sideBLength);
	}

	@Override
	public double getArea() {
		return sideALength * sideBLength;
	}

	@Override
	public int compareTo(Shape that) {
		if (this.getArea() == that.getArea()) return 0;
		return this.getArea() > that.getArea() ? 1 : -1;
	}
}
