import java.util.Scanner;
public class Center
{
	static String word1;
	static String word2;
	static String word3;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter three words: ");
		word1 = kb.nextLine();
		System.out.println("Please enter three words: ");
		word2 = kb.nextLine();
		System.out.println("Please enter three words: ");
		word3 = kb.nextLine();
		makeCenter();
	}
	
	public static void makeCenter()
	{
		if(word.length >= 20)
			return word;
		else
			return makeCenter(word + (word.indexOf(" ")) + word.substring(word.indexOf(" ") +1));
		
	}	
}