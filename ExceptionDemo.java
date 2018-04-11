import java.util.*;
public class ExceptionDemo
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try
		{
			int c = a/b;
			System.out.println("c = "+c);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
