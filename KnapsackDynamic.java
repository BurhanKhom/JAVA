import java.util.*;
public class KnapsackDynamic 
{
	static int solve(int n, int c, int w[], int p[])
	{
		int i, j, help[][]=new int[n+1][c+1];
		for(i=0; i<=n; i++)
			help[i][0]=0;
		for(j=0; j<=c; j++)
			help[0][j]=0;
		
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=c; j++)
			{
				if(j-w[i]<0)
					help[i][j]=help[i-1][j];
				else
				{
					if(help[i-1][j]>(p[i]+help[i-1][j-w[i]]))
						help[i][j] = help[i-1][j];
					else
						help[i][j] = help[i-1][j-w[i]]+p[i];
					
				}
			}
		}
		System.out.print("Items considered : ");
		int pro = help[n][c], flag=0;
		while(pro!=0)
		{
			for(i=0; i<=n; i++)
			{
				flag=0;
				for(j=0; j<=c; j++)
				{
					if(help[i][j]==pro)
					{
						pro-=p[i];
						System.out.print(i+" ");
						flag=1;
						break;
					}
				}
				if(flag==1)
					break;
			}
		}
		System.out.println();
		/*Check Matrix
		for(i=0; i<=n; i++)
		{
			for(j=0; j<=c; j++)
			{
				System.out.print(help[i][j]+" ");
			}
			System.out.println();
		}*/
		return help[n][c];
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int i, n = sc.nextInt();
		int w[]=new int[n+1], p[]=new int[n+1];
		System.out.print("Enter capacity : ");
		int c = sc.nextInt();
		System.out.print("Enter weights : ");
		for(i=1; i<=n; i++)
			w[i]=sc.nextInt();
		System.out.print("Enter Profits : ");
		for(i=1; i<=n; i++)
			p[i]=sc.nextInt();
		
		System.out.println("Max Profit = "+solve(n, c, w, p));
		sc.close();
	}
}
