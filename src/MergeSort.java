/*
 * 
 * 
 * Time Complexity O(nlogn)
 * 
 */
public class MergeSort {


	public  void merge(int arr[],int l,int m,int r) {

		int n1=m-l+1;
		int n2=r-m;

		int A[]=new int[n1];
		int B[]=new int[n2];

		for(int i=0;i<n1;i++) {
			A[i]=arr[l+i];
		}

		for(int j=0;j<n2;j++) {
			B[j]=arr[m+1+j];
		}
		int i = 0,j = 0,k=l;
		
		while(i<n1 && j<n2) {
			if(A[i]<B[j]) {
				arr[k]=A[i];
				i++;
			}
			else {
				arr[k]=B[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=A[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k]=B[j];
			j++;
			k++;
		}
	}
	
	public void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"|");
		}
	}
	public void sort(int arr[],int l,int r) {
		int m=0;
		if(l<r) {

			m=l+(r-l)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);

		}
	}

	public static void main(String[] args) {

		int arr[]=new int[] {38,27,43,3,9,82,10};
		MergeSort obj=new MergeSort();
		obj.sort(arr,0,arr.length-1);
		obj.print(arr);
	}
}
