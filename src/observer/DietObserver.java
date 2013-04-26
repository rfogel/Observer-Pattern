package observer;

import observer.Observer;

public class DietObserver implements Observer 
{
	public DietObserver() {}
	
	@Override
	public void update(Object weight) 
	{
		if ((Double)weight >= 100) {
			System.out.println("You trespassed the weight limit!");
		}
	}
}
