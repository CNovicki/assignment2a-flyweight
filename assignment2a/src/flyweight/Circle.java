package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape {

	private Color color;
	
	private int x;
	
	private int y;
	
	private int radius;
	
	public Circle(Color color) {
		
		this.color = color;
		
	}
	
	@Override
	public void draw(Graphics g) {
		
		g.setColor(color);
		
		g.fillOval(x, y, radius, radius);
		
		System.out.println("drew a " + color + " circle with position x=" + x + " and y=" + y);
		
	}
	
	public Color getColor() {
	
		return color;
	
	}

	public void setColor(Color color) {
	
		this.color = color;
	
	}

	public int getX() {
		
		return x;
		
	}
	
	public void setX(int x) {
		
		this.x = x;
		
	}
	
	public int getY() {
		
		return y;
		
	}
	
	public void setY(int y) {
		
		this.y = y;
		
	}
	
	public int getRadius() {
		
		return radius;
		
	}
	
	public void setRadius(int radius) {
		
		this.radius = radius;
		
	}
	
}
