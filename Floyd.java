import java.util.*;
public class Floyd {

	static int min(int a, int b){if(a>b)return b; return a;}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int i, j, k, n = sc.nextInt();
		int g[][] = new int[n][n], a[][] = new int[n][n];
		System.out.println("Enter Matrix : ");
		for(i=0; i<n; i++)
			for(j=0; j<n; j++)
				g[i][j] = sc.nextInt();
		for(i=0; i<n; i++)
			for(j=0; j<n; j++)
				for(k=0; k<n; k++)
					a[j][k] = g[j][k] = min(g[j][k], g[j][i]+g[i][k]);
		System.out.println("All pair shortest path matrix : ");
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		
	}
	
/*
Sample Input
0 5 4 999
5 0 1 7
4 1 0 3
999 7 3 0
*/	
	
}
