package flyweight;

import javax.swing.SwingUtilities;

public class FlywieghtPatternDemo {
		
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(() -> {
		
			Window window = new Window(800, 600);
		
			window.createAndShowGUI();
		
		});
		
	}
	
}
