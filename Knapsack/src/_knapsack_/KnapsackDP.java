package _knapsack_;
import java.util.*;

public class KnapsackDP {
	
	static int max(int a, int b){ 
		return(a > b) ? a : b; }
	static int knapsack(int c, int wt[], int val[], int n) { 
		if(n == 0 || c == 0) { 
			return 0;
		}if(wt[n-1] > c) { 
			return knapsack(c, wt, val, n-1); 
		}else{
			return max(val[n-1] + knapsack(c-wt[n-1], wt, val, n-1), knapsack(c, wt, val, n-1));
		} 

		}
	public static void main(String[] args) { // TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of value and weight array : "); 
		int n = sc.nextInt(); 
		int val[] = new int[n]; 
		int wt[] = new int[n];
		System.out.println("Enter the capacity: "); 
		int capacity = sc.nextInt();
		System.out.println("Enter value array of size " + n + " : "); 
		for(int i = 0; i < n; i++) {
			val[i] = sc.nextInt(); 
		}
		System.out.println("Enter weight array of size " + n + " : "); 
		for(int j = 0; j < n; j++){
			wt[j] = sc.nextInt();
		}
		System.out.println("Maximum profit obtained : ");
		System.out.println(knapsack(capacity, wt, val, n));
		}

}
