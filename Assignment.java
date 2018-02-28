import java.util.*;
public class Assignment {
	
	static void read(int a[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			System.out.print("Enter Students in C"+i+" : ");
			a[i]=sc.nextInt();
		}
	}
	static void display(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print("\tC"+i+" : ");
			for(int j=1; j<=a[i]; j++)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		int school1[] = new int[4];
		int school2[] = new int[3];
		int school3[] = new int[2];
		
		System.out.println("S0");
		read(school1);
		
		System.out.println("S1");
		read(school2);
		
		System.out.println("S2");
		read(school3);
		
		
		System.out.println("\nS0");
		display(school1);
		
		System.out.println("S1");
		display(school2);
		
		System.out.println("S2");
		display(school3);
	}	
}