import java.util.Scanner;
public class Course{
	
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of course");
		int num = input.nextInt();
		if(num==0){
			System.out.println("Invalid Range"); 
		}
		else if(num>20)
			System.out.println("Maximum number of courses are 20 only");
		else{
			String course[] = new String[num];
			System.out.println("Enter courses names....");
			for(int i=0; i<course.length; i++){
				course[i] = input.nextLine();
			}

			System.out.println("Enter the course to be searched");
			String search = input.nextLine();

			boolean isAvailable = false;
			for(int i=0; i<course.length; i++){
				if(search.equals(course[i]))
					System.out.println(search+" course is available");
					isAvailable = true;
					break;
			}

			if(!isAvailable)
				System.out.println(search+" course is not available");

		}
	}
}