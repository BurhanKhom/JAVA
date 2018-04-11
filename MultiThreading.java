import java.util.*;
class First extends Thread
{
	Random r = new Random();
	public void run()
	{
		for(int i=0; i<3; i++)
		{
			int num = r.nextInt(20);
			System.out.println(num);
			
			Thread t1 = new Thread(new Second(num));
			t1.start();
			
			Thread t2 = new Thread(new Third(num));
			t2.start();
			
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				//do nothing
			}
		}
	}
}
class Second extends Thread
{
	int x;
	Second(int x)
	{
		this.x = x;
	}
	public void run()
	{
		System.out.println(x*x);
	}
}
class Third extends Thread
{
	int x;
	Third(int x)
	{
		this.x = x;
	}
	public void run()
	{
		System.out.println(x*x*x);
	}
}
public class MultiThreading 
{
	public static void main(String args[])
	{
		First t = new First();
		t.start();
	}
	
}
