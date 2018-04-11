import java.util.*;
public class MergeSort 
{
	static final int MAX = 10000;
	static int res[] = new int[MAX];
	static void merge(int a[], int l, int mid, int r)
	{
		
		int i=l, j=mid+1, k=0;
		while(i<=mid && j<=r)
		{
			if(a[i]<=a[j]) res[k++] = a[i++];
			else		res[k++] = a[j++];
		}
		while(i<=mid)
			res[k++]=a[i++];
		while(j<=r)
			res[k++]=a[j++];
		i=l;
		for(int x=0; x<k; x++)
			a[i++] = res[x];
			
	}
	static void msort(int a[], int l, int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;
			msort(a, l, mid);
			msort(a, mid+1, r);
			merge(a, l, mid, r);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		Random r = new Random();
		System.out.println("Generating "+n+" random numbers : ");
		for(int i=0; i<n; i++)
		{
			a[i] = r.nextInt(n);
			System.out.print(a[i]+" ");
		}
		long beg = System.currentTimeMillis();
		msort(a, 0, n-1);
		long end = System.currentTimeMillis();
		System.out.println("Sorted array : ");
		for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
		System.out.println("\nTime to sort : "+(end-beg)+"ms");
		//check
		for(int i=0; i<n-1; i++)
		{
			if(a[i]>a[i+1])
			{
				System.out.printf("Sort Failed");
				break;
			}
		}
	}

}
