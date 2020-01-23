package assignment2a;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<>();
	
	private int state;
	
	public void attach(Observer observer) {
		
		observers.add(observer);
		
	}
	
	public void notifyAllObservers() {
		
		for(Observer o : observers) {
			
			o.update();
			
		}
		
	}
	
	public int getState() {
		
		return state;
		
	}
	
	public void setState(int state) {
		
		this.state = state;
		
	}
	
}
