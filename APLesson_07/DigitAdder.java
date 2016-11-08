import java.util.Scanner;
public class DigitAdder
{
	static int number;
	static int sum = 0;
	int num = number;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		sumDigits();
		System.out.println("The sum of digits in " + number + " is" + sum );
	}
	public static void sumDigits()
	{
		while(num > 0)
		{
			number % 10 + sum
			num /= 10;
		}	
	}
}