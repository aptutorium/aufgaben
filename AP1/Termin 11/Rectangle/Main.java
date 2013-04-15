public class Main {
	
	public static void main(String[] args) {
		
		Rectangle myRectangle = new Rectangle(5, 5);
		
		System.out.println(myRectangle.getArea());
		System.out.println(myRectangle.getPerimeter());

		myRectangle.setEdges(0, 0);

		if (myRectangle.isSquare()) {
			System.out.println("Es ist ein Quadrat!");
		}
	}
	
}