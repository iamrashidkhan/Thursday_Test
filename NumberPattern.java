import java.util.Scanner;	//Importing the scanner class to take the user input

public class NumberPattern{
	public static void main(String args[]){

		Scanner scc = new Scanner(System.in);	//Creating the object of scanner class

		System.out.println("Enter the number till when you want the pattern to be printed");
		int num = scc.nextInt();	//Taking input number from user

		for(int i=1; i<num+1; i++)	//First for loop for the rows
		{
			for(int j=1; j<=i; j++)	//Second for loop for the column
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}