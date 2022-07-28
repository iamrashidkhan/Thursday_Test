import java.util.Scanner;	//Importing the scanner class to take input from the user

public class Cube
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);	  //Creating the instance of the scanner class

		System.out.println("Enter the last term till which you want the cube series");
		int num = input.nextInt();

		for(int i=1; i<=num; i++)	//For loop to print the cube
		{
			System.out.println("Cube of "+i+" is "+ (i*i*i));
		}
	}
}