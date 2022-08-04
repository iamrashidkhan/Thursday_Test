/*
A simple java program to test the quality of two arrays
By : Rashid Khan
*/

import java.util.*;
public class EqualityArray{
	public static void main(String args[]){
		boolean equal = true;	//Initially taking that the arrays are equal
		int a[] = {1, 2, 3, 4, 5};
		int b[] = {1, 2, 33, 4, 5};
		
		//For loop to iterate
		for(int i=0; i<a.length || i<b.length; i++){
			//If a single element is mismatched then boolean value will become false
			if(a[i] != b[i])
				equal = false;
		}
		
		if(equal)
			System.out.println("Both arrays are equal");
		else
			System.out.println("Both arrays are not equal");

	}
}