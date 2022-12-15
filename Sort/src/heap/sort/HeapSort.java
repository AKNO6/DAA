package heap.sort;
import java.util.*;

public class HeapSort {
	
	void heapify(int arr[],int n,int i)
	{
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;		
		if(l<n && arr[l]>arr[largest])
		{
			largest=l;
		}
		if(r<n && arr[r]>arr[largest])
		{
		    largest=r;	
		}		
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,n,largest);
		}
	}	
	void heapSort(int arr[],int n)
	{
		for(int i=(n/2)-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the no. elements:");
		Scanner r=new Scanner(System.in);
        n=r.nextInt();
        int a[]=new int[n];
        
        System.out.println("Enter all the elements: ");
        for(int i=0;i<n;i++)
        {
        	a[i]=r.nextInt();
        }        
        HeapSort h=new HeapSort();
        h.heapSort(a,n);        
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        }
	}

}
