import java.util.*;
public class Dijkstra 
{
    static final int MAX = 999;
    static void solve(int src, int a[][], int n)
    {
    	int i, in=0, min=999, finalize[] = new int[n], dist[] = new int[n];
    	int parent[] = new int[n];

        for(i=0; i<n; i++)
        {
        	dist[i]=999;
        	finalize[i]=0;
        }
        
        dist[src] = 0;
        while(true)
        {
        	min=999;
            for(i=0; i<n; i++)
            	if(finalize[i]==0)
                	if(min>dist[i])
                    {
                    	min = dist[i];
                        in = i;
                    }
            if(min==999)
	            break;
            finalize[in]=1;
            for(i=0; i<n; i++)
            	if(finalize[i]!=1 && dist[i] > a[in][i]+dist[in])
                   {
                			dist[i] = a[in][i]+dist[in];
                			parent[i] = in;
                   }
            
        } 
        for(i=0; i<n; i++)
        {
        		int j=i;
        		System.out.println("From "+src+" to "+i);
        		System.out.print("Path : "+i+"<-");
        		while(true)
        		{
        			if(parent[j]==src)
        				break;
        			System.out.print(parent[j]+"<-");
        			j = parent[j];
        		}

        		System.out.println(src+"\nTotal cost : "+dist[i]+"\n");	
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of nodes : ");
        int n = sc.nextInt();
        int adj[][] = new int[n][n];
        System.out.println("Enter the adjacency matrix : ");      
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                adj[i][j] = sc.nextInt();    
        System.out.print("Enter source : ");
        int s = sc.nextInt();
        solve(s, adj, n);
        sc.close();
    }
}
/*Sample Input
4
0 2 999 8
999 0 999 1
999 3 0 999
999 999 6 0

8
0 2 999 999 999 999 999 999
999 0 9 999 999 999 999 4
999 999 0 1 999 3 999 999
999 999 999 0 6 999 3 999
999 999 999 999 0 999 999 999
999 999 999 999 5 0 999 999
999 999 999 999 999 999 0 999
4 999 999 999 999 999 999 0
*/