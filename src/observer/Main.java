
package observer;


public class Main
{
	public static void main(String[] args)
	{
		DietObserver balanca = new DietObserver();
        Diet diet = new Diet(80);
        diet.registerObserver(balanca);
        diet.setWeight(170);
	}
}
