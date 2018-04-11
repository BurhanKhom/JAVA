import java.util.*;
public class Customer 
{
	String name, s;
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		name = sc.next();
		System.out.print("DOB : ");
		s =sc.next();
	}
	void display()
	{
		System.out.print(name);
		StringTokenizer st = new StringTokenizer(s, "/");
		while(st.hasMoreElements())
		{
			System.out.print(", "+st.nextElement());
		}
		System.out.println();
	}
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		Customer c[] = new Customer[n];
		for(int i=0; i<n; i++)
		{
			c[i] = new Customer();
			c[i].read();
		}
		for(int i=0; i<n; i++)
			c[i].display();
	}
}
