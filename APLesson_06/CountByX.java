import java.util.Scanner;
public class CountByX
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an end number: ");
		int number1 = kb.nextInt();
		System.out.println("Please enter a number to count up by: ");
		int number2 = kb.nextInt();

		for(int i = number2; i <= number1; i+=number2)
		{
			System.out.print(i + " ");
		}
	}
}