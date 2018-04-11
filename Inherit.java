import java.util.*;

class Staff
{
	
	int id, sal, phone;
	String name;
	
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		name = sc.next();
		System.out.print("ID : ");
		id = sc.nextInt();
		System.out.print("Salary : ");
		sal = sc.nextInt();
		System.out.print("Phone : ");
		phone = sc.nextInt();
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Salary : "+sal);
		System.out.println("Phone : "+phone);
	}
}
class Teaching extends Staff
{
	String domain;
	int pub;
	void teachRead()
	{
		super.read();
		Scanner sc = new Scanner(System.in);
		System.out.println("Domain : ");
		domain = sc.next();
		System.out.println("Publications : ");
		pub = sc.nextInt();
	}
	void teachDisplay()
	{
		super.display();
		System.out.println("Domain : "+domain);
		System.out.println("Publications : "+pub);
	}
}
class Technical extends Staff
{
	String skills;
	void techread()
	{
		super.read();
		Scanner sc = new Scanner(System.in);
		System.out.print("Skills : ");
		skills = sc.next();
	}
	void techDisplay()
	{
		super.display();
		System.out.println("Skills : "+skills);
	}
}
class Contract extends Staff
{
	int per;
	void conRead()
	{
		super.read();
		Scanner sc = new Scanner(System.in);
		System.out.println("Period : ");
		per = sc.nextInt();
	}
	void conDisplay()
	{
		super.display();
		System.out.println("Period : "+per);
	}
}
public class Inherit 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of staff : ");
		int n = sc.nextInt();
		Teaching t[] = new Teaching[n];
		Technical te[] = new Technical[n];
		Contract c[] = new Contract[n];
		
		for(int i=0; i<3; i++)
		{
			if(i==0)
			{
				for(int j=0; j<n; j++)
				{
					t[j] = new Teaching();
					t[j].teachRead();
				}
			}
			else if(i==1)
			{
				System.out.println("Technical Staff details : ");
				for(int j=0; j<n; j++)
				{
					te[j] = new Technical();
					te[j].techread();
				}
			}
			else
			{
				System.out.println("Contract Staf details : ");
					for(int j=0; j<n; j++)
					{
						c[j] = new Contract();
						c[j].conRead();
					}
			}
		}
		for(int i=0; i<n; i++)
			t[i].teachDisplay();
		for(int i=0; i<n; i++)
			te[i].techDisplay();
		for(int i=0; i<n; i++)
			c[i].conDisplay();
		
	}
}
