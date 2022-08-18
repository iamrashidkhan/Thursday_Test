public class Count
{
	public int count(char[] CharArr)
	for(char ch:CharArr)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
		}
		try {
			if(ch=='x') {
				System.out.println("Checked Exception");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		Count c=new Count();
		char[] CharArray={'a','b','c','d','e','f','g','x','y','z'};
		int countValueOfVowel=obj.countVowels(CharArray);
		System.out.println(countValueOfVowel);
	}	
}