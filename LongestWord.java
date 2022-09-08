import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWord{

	//Throws file not found exception so handle the flow of program
	public static void main(String args[]) throws FileNotFoundException{
		new LongestWord().findLongestWords();
	}

	//Throws file not found exception so handle the flow of program
	public String findLongestWords() throws FileNotFoundException{
		String Longest_Word="";
		String current;
		Scanner sc=new Scanner(new File("C:\\users\\desktop\\rashidkk\\javafile.txt"));
		while(sc.hasNext()){
			current=sc.next();
			if(current.length()>Longest_Word.length()){
				Longest_Word=current;
			}
		}
		System.out.println("\n"+Longest_Word+"\n");
		return Longest_Word;		//Will return the longest word
	}
}