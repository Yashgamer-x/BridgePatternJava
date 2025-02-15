package practice;

import java.util.concurrent.locks.*;

public class Shopper extends Thread
{
	static int garlicCount = 0;
	static int potatoCount = 0;
	static ReentrantLock pencil = new ReentrantLock();
	private void addGarlic()
	{
		pencil.lock();
		System.out.println("Hold Count: "+ pencil.getHoldCount());
		garlicCount++;
		pencil.unlock();
	}
	private void addPotato()
	{
		pencil.lock();
		potatoCount++;
		addGarlic();
		pencil.unlock();
	}
	public void run()
	{
		for(int i=0;i<10_000;i++)  
		{
			addGarlic();
			addPotato();
		}
	}
}
