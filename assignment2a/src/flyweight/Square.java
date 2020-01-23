package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Square implements Shape {

	private Color color;
	
	private int x;
	
	private int y;
	
	private int length;
	
	public Square(Color color) {
		
		this.color = color;
		
	}
	
	@Override
	public void draw(Graphics g) {
	
		g.setColor(color);
		
		g.fillRect(x, y, length, length);
		
		System.out.println("drew a " + color + " square with position x=" + x + " and y=" + y);
	
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

	public int getLength() {
	
		return length;
	
	}

	public void setLength(int length) {
	
		this.length = length;
	
	}
	
}
