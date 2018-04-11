import java.util.*;
public class StackDemo
{
	static final int MAX=5;
	static int s[] = new int[MAX];
	static int top=-1;
	static void push(int ele)
	{
		if(top==MAX-1)
			System.out.println("Stack Overflow!");
		else
			s[++top]=ele;
	}
	static int pop()
	{
		if(top==-1)
			return 0;
		else
			return s[top--];
	}
	static void display()
	{
		for(int i=top; i>=0; i--)
			System.out.println(s[i]);
	}
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1 : System.out.print("Enter element to push : ");
						 int e = sc.nextInt();
						 push(e);
						 break;
				case 2 : int x = pop();
						 if(x!=0)
							 System.out.println("Deleted : "+x);
						 else
							 System.out.println("Stack Underflow!");
						 break;
				case 3 : display();
						 break;
				case 4 : System.exit(0);
			}
		}
	}
	
	
}
