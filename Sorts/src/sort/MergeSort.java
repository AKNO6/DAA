package sort;

public class MergeSort {

	void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;  
        int L[] = new int[n1];
        int R[] = new int[n2];  
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;  
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //Array updation  
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }  
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    void sort(int arr[], int l, int r)
    {
    	printArray(arr);
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;  
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
  
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  	public static void main(String[] args) {
  		
  		int a[] = {5,7,3,9,12,8};  		
  		MergeSort ob = new MergeSort();
  		ob.sort( a, 0, a.length -1);  		
  		ob.printArray(a); 		
  		

	}

}
