package flyweight;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.WHITE, Color.BLACK, Color.PINK, Color.ORANGE, Color.YELLOW, Color.CYAN, Color.MAGENTA};

	private JFrame frame;
		
	private int width;
	
	private int height;
	
	public Window(int width, int height) {
		
		this.width = width;
		
		this.height = height;
		
		frame = new JFrame("Flyweight Pattern Demo");
				
	}
	
	public void createAndShowGUI() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(width, height);
		
		frame.setResizable(false);
		
		setPreferredSize(new Dimension(width, height));
		
		frame.add(this);
		
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
	}
	
	private static Color getRandomColor() {
		
		return colors[(int) (Math.random() * colors.length)];
		
	}
	
	private static int getRandomX() {
		
		return (int) (Math.random() * 700);
		
	}
	
	private static int getRandomY() {
		
		return (int) (Math.random() * 500);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		//super.paintComponent(g);
		
		for(int i = 0; i < 10; ++i) {
			
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			
			circle.setX(getRandomX());
			
			circle.setY(getRandomY());
			
			circle.setRadius(100);
		
			circle.draw(g);
			
		}
		
		for(int i = 0; i < 10; ++i) {
			
			Square square = (Square) ShapeFactory.getSquare(getRandomColor());
			
			square.setX(getRandomX());
			
			square.setY(getRandomY());
			
			square.setLength(100);
		
			//square.draw(g);
			
		}
		
		for(int i = 0; i < 10; ++i) {
			
			Triangle triangle = (Triangle) ShapeFactory.getTriangle(getRandomColor());
			
			triangle.setX(getRandomX());
			
			triangle.setY(getRandomY());
			
			triangle.setHeight(100);
		
			//triangle.draw(g);
			
		}
		
	}

	public JFrame getFrame() {
	
		return frame;
	
	}

	public void setFrame(JFrame frame) {
	
		this.frame = frame;
	
	}

	@Override
	public int getWidth() {
	
		return width;
	
	}

	public void setWidth(int width) {
	
		this.width = width;
	
	}

	@Override
	public int getHeight() {
	
		return height;
	
	}

	public void setHeight(int height) {
	
		this.height = height;
	
	}
	
}
