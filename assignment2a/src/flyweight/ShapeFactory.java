package flyweight;

import java.awt.Color;
import java.util.HashMap;

public class ShapeFactory {
	
	private static final HashMap<Color, Shape> circleMap = new HashMap<>();
	
	private static final HashMap<Color, Shape> squareMap = new HashMap<>();
	
	private static final HashMap<Color, Shape> triangleMap = new HashMap<>();
	
	public static Shape getCircle(Color color) {
		
		Circle circle = (Circle) circleMap.get(color);
		
		if(circle == null) {
			
			circle = new Circle(color);
			
			circleMap.put(color, circle);
			
			System.out.println("Creating circle of color: " + color);
			
		}
		
		return circle;
		
	}
	
	public static Shape getSquare(Color color) {
		
		Square square = (Square) squareMap.get(color);
		
		if(square == null) {
			
			square = new Square(color);
			
			squareMap.put(color, square);
			
			System.out.println("Creating square of color: " + color);
			
		}
		
		return square;
		
	}
	
	public static Shape getTriangle(Color color) {
		
		Triangle triangle = (Triangle) triangleMap.get(color);
		
		if(triangle == null) {
			
			triangle = new Triangle(color);
			
			triangleMap.put(color, triangle);
			
			System.out.println("Creating triangle of color: " + color);
			
		}
		
		return triangle;
		
	}
	
}
