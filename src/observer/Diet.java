package observer;

import java.util.ArrayList;
import java.util.List;

public class Diet implements Observable 
{
	private List<Observer> observers = new ArrayList<Observer>();
	private double weight;

	public Diet(double weight) {
		this.weight = weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
		this.notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() 
	{
		for (Observer ob : observers)
		{
			System.out.println("Notificando observers!");
			ob.update(this.weight);
		}
	}
}