package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle implements Shape {

	private Color color;
	
	private int x;
	
	private int y;
	
	private int height;
	
	public Triangle(Color color) {
		
		this.color = color;
		
	}
	
	@Override
	public void draw(Graphics g) {
		
		int length = (int) (Math.abs((height / Math.sin(60))));
		
		System.out.println(length);
		
		int[] x = {this.x, this.x + length / 5, this.x - length / 5};
		
		int[] y = {this.y, this.y + height, this.y + height};
		
		g.setColor(color);
		
		g.fillPolygon(x, y, 3);
		
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

	public int getHeight() {
	
		return height;
	
	}

	public void setHeight(int height) {
	
		this.height = height;
	
	}
	
}
