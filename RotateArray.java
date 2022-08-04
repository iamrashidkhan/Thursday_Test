/*
A java program to cyclically rotate a given array clockwise by one.
Sample input : 10 20 30 40 50 60
Expected output : 60 50 40 30 20 10
Written By : Rashid Khan
*/
import java.util.Scanner;	//importing the scanner class
public class RotateArray{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);	  //Creating an instance of the class
		System.out.print("Enter the size of the array you want : ");
		int size = input.nextInt();
		int[] arr = new int[size];
		int[] rotated = new int[size];

		//For loop for taking the input values of arr array
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter the "+ (i+1)+" value : ");
			arr[i] = input.nextInt();
		}

		//Printing the entered elements of array
		System.out.println("Entered array is as follows");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}

		//Rotating the arr array and storing the values in another rotated array
		for(int i=0; i<rotated.length; i++){
			rotated[i] = arr[size-i-1];
		}

		//Printing the values of the rotated array
		System.out.println();
		System.out.println("Rotated array is as follows");
		for(int i=0; i<rotated.length; i++){
			System.out.print(rotated[i]+" ");
		}
		
	}
}