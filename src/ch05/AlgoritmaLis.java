package ch05;

public class AlgoritmaLis { 
	static int mxref;
	static int lis(int arr[], int n){ 
		if (n == 1) 
			return 1; 
		int res, akhir = 1; 		
		for (int i = 1; i < n; i++) { 
			res = lis(arr, i); 
			if (arr[i - 1] < arr[n - 1] && res + 1 > akhir) 
				akhir = res + 1; 	} 
		if (mxref < akhir) 
			mxref = akhir; 		
        return akhir; 
    } 	
	static int Lat(int arr[], int n) { 		
		mxref = 1; 		
		lis(arr, n); 		
		return mxref; 	} 	
	public static void main(String args[]) { 
		int arr[] = { 5, 50, 9, 16, 15, 1, 7, 88 }; 
        int n = arr.length; 
        
		System.out.println("Panjang LIS yaitu "
						+ lis(arr, n) + "\n"); 
	} 
} 