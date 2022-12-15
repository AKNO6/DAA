package _binary_;
import java.util.Scanner;

public class Binary_Search {
	
	static int bSearch(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of the array: "); 
		int n = sc.nextInt(); int arr[] = new int[n];
		System.out.print("Enter " + n +" numbers: "); 
		for(int i = 0; i < n; i++) 
		{ 
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the key: ");
		int x = sc.nextInt();   
        System.out.println(bSearch(arr, n, x));
		
    } 

}
