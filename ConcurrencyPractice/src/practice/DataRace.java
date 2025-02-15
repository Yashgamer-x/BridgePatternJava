package practice;

public class DataRace 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Thread barron = new Shopper();
		Thread olivia = new Shopper();
		
		olivia.start();
		barron.start();
		barron.join();
		olivia.join();
		System.out.println("You should buy "+Shopper.garlicCount+" garlic");
		System.out.println("You should buy "+Shopper.potatoCount+" potato");
	}
}
