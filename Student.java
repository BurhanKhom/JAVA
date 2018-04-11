import java.util.*;
public class Student {
	String name, usn, branch;
	long phone;
	
	void insert(String Name, String USN, String Branch, long Phone)
	{
		name = Name;
		usn = USN;
		branch = Branch;
		phone = Phone;
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("USN : "+usn);
		System.out.println("Branch : "+branch);
		System.out.println("Phone : "+phone);
	}
	public static void main(String... args)
	{
		String name, usn, branch;
		long phone;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		Student st[] = new Student[n];
		for(int i=0; i<n; i++)
		{
			st[i] = new Student();
			System.out.print("Enter Name : ");
			name = sc.next();
			System.out.print("Enter USN : ");
			usn = sc.next();
			System.out.print("Enter Branch : ");
			branch = sc.next();
			System.out.print("Enter Phone : ");
			phone = sc.nextLong();
			st[i].insert(name, usn, branch, phone);
		}
		for(int i=0; i<n; i++)
		{
			System.out.println("Stduent "+(i+1)+":");
			st[i].display();
		}
	}

}
