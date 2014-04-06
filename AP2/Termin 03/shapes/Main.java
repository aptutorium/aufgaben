package shapes;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// Container für Shapes anlegen
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		// Unterschiedliche Shapes anlegen
		Rectangle first = new Rectangle(10, 15);
		Rectangle second = new Rectangle(3, 5);
		Square third = new Square(20);
		Square fourth = new Square(10);
		
		shapes.add(first);
		shapes.add(second);
		shapes.add(third);
		shapes.add(fourth);
		
		// unsortierte ausgabe
		printShapes(shapes);
		
		// Shapes sortieren
		Collections.sort(shapes);
		
		// sortierte ausgabe
		printShapes(shapes);
		
	}

	public static void printShapes(ArrayList<Shape> shapes) {
		// Unsortierte Ausgabe der Flaeche jeder Shape
		System.out.println("===========================");
		
		for (Shape shape : shapes) {
			System.out.println("Die Flaeche betraegt: " + shape.getArea());
		}
		
		System.out.println("===========================");
	}
	
}
