import java.util.*;
public class SubsetSum 
{
	static int x[] = new int[100000];
	static int ss, a[] = new int[100000];
	static void solve(int curSum, int k, int remSum)
	{
		x[k]=1;
		if(curSum+a[k]==ss)
		{
			for(int i=0; i<=k; i++)
				if(x[i]==1)
					System.out.print(a[i]+" ");
			System.out.println();
		}
		
		else if(curSum+a[k]+a[k+1]<=ss)
			solve(curSum+a[k], k+1, remSum-a[k]);
		
		if(curSum+remSum-a[k]>=ss && curSum+a[k]<=ss)
		{
			x[k]=0;
			solve(curSum, k+1, remSum-a[k]);
					
		}
		
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int i, sum=0, n = sc.nextInt();
		for(i=0; i<n; i++)x[i]=0;
		System.out.print("Enter elements of super set : ");
		for(i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
			sum+=a[i];
		}
		System.out.print("Enter subset sum : ");
		
		ss = sc.nextInt();
		if(sum<ss)
		{
			System.out.println("No solution");
			System.exit(0);
		}
		solve(0, 0, sum);
	}
}
