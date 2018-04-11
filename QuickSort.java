import java.util.*;
public class QuickSort
{
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
		qsort(a, 0, n-1);
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
	
	static void qsort(int a[], int l, int r)
	{
		if(l<r)
		{
			int pi = partition(a, l, r);
			qsort(a, l, pi-1);
			qsort(a, pi+1, r);
		}
	}
	static int partition(int a[], int l, int r)
	{
		int i, j, pivot;
		i = l+1;
		j = r;
		pivot = a[l];
		
		while(true) 
		{
			while(a[i]<=pivot && i<r) i++;
			while(a[j]>pivot && j>l) j--;
			
			if(i<j)
				swap(a, i, j);
			else
			{
				swap(a, j, l);
				return j;
			}
		}
	}
	static void swap(int a[], int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
