/*
This is a program of demonstrating the conversion of matrix into the transpose of a matrix
Coded by : Rashid Khan 
*/

public class Transpose{
	public static void main(String args[]){
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};	//Initializing the values of array

		System.out.println();
		System.out.println("Original matrix : ");
		//Printing the original matrix
		for(int i=0; i<arr.length; i++){
			for(int j=0 ; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("After transposing the matrix : ");
		//Printing the transposed matrix
		//Coverting all the rows to its corresponding columns
		//and all the columns to its corresponding rows is called transposed matrix
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}
	}
}