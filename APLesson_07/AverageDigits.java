import java.util.Scanner;
public class AverageDigits
{
	static int number;
	static int digits = 0;
	static double average = 0;
	static double avg;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + avg);

	}
	public static void avDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average = average + (num % 10);
			num /= 10;
		}	
		avg = average / digits;
	}
}
