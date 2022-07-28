import java.util.Scanner;  //Importing the scanner class

public class Weekdays
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);  	//Creating the instance of the scanner class
		System.out.println("Enter any number of your choice");
		System.out.println("Only between 1 and 7");
		int num = sc.nextInt();	  //Storing the user inputted number in the variable num

		System.out.println("Choosen number is "+ num);

		switch(num)	  //Passing the inputted number in switch case
		{
			case 1:
			{
				System.out.println("As per the input corresponding day is Monday");
				break;
			}
			case 2:
			{
				System.out.println("As per the input corresponding day is Tuesday");
				break;
			}
			case 3:
			{
				System.out.println("As per the input correponding day is Wednesday");
				break;
			}
			case 4:
			{
				System.out.println("As per the input corresponding day is Thursday");
				break;
			}
			case 5:
			{
				System.out.println("As oer the input corresponding day is Friday");
				break;
			}
			case 6:
			{
				System.out.println("As per the input corresponding day is Saturday");
				break;
			}
			case 7:
			{
				System.out.println("As per the input corresponding day is Sunday");
				break;
			}
			default:
				System.out.println("OOPS!! You entered number out of range");
		}
	}
}