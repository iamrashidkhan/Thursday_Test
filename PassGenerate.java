import java.util.*;
import java.util.Scanner;
import java.util.regex.*;

public class PassGenerate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Password Generator: ");
		String password = input.next();
		String regex = "^(?=.*[@*#])(?=.*[a-z])(?=.*[A-Z])[A-Za-z0-9@*#]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		boolean match = matcher.find();
		
		if(match) {
			System.out.println("Valid code");
		}
		else {
			System.out.println("Invalid Code");
		}
	}
}