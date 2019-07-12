
public class PrintDiagonalSerial {


	public static void printDiagonal(int arr[][]){

		int m=arr[0].length;
		for(int k=0;k<m;k++) {

			int i=k;
			int j=0;

			while(i>=0) {
				System.out.print(arr[i][j]+" ");
				i--;
				j++;
			}
			System.out.println("");
		}

		for(int k=1;k<m;k++) {

			int i=m-1;
			int j=k;

			while(j<m) {
				System.out.print(arr[i][j]+" ");
				i--;
				j++;
			}
			System.out.println("");	
		}
	}
	public static void main(String[] args) {


		int arr[][]=new int[][] {{1,2,3,10},
			{4,5,6,11},
			{7,8,9,12},
			{13,14,15,16}};

			printDiagonal(arr);
	}
}
