
/*
 *Given a sorted array and a number x,
 *Find the pair in array whose sum is closest to x Find the Closest pair of number in sorted array with sum 
 * 
 * 
 * 
 */

public class ClosestNumberInSortedArray {


	public static void findClosestPair(int arr[],int x) {

		int l=0;
	
		int r=arr.length-1;
		int diff=Integer.MAX_VALUE; 
		int  res_l=0; 
		int res_r=0; 
		while (r > l) 
		{ 
			if (Math.abs(arr[l] + arr[r] - x) < diff) 
			{ 

				res_l = l; 
				res_r = r; 
				diff = Math.abs(arr[l] + arr[r] - x); 
			} 


		 if (arr[l] + arr[r] > x) 
				r--; 
			else
				l++; 
		} 

		System.out.println(" The closest pair is "+arr[res_l]+" and "+ arr[res_r]); 
	}
	public static void main(String[] args) {

		int arr[] = new int[]{10, 22, 28, 29, 30, 40};
		int x = 54;
		findClosestPair(arr,x);

	}
}
