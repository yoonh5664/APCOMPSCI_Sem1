import java.util.Scanner;
public class Receipt1
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		Receipt1 receipt = new Receipt1();
		
		System.out.println("Please enter item 1:");
		
		String name1 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double number1 = keyboard.nextDouble();
		System.out.println("Please enter item 2: ");
		keyboard.nextLine();
		
		String name2 = keyboard.nextLine();
		System.out.println("Please enter the price:  ");
		
		
		double number2 = keyboard.nextDouble();
		System.out.println("Please enter item 3: ");
		keyboard.nextLine();
		
		String name3 = keyboard.nextLine();
		System.out.println("Please enter the price: ");
		double number3 = keyboard.nextDouble();
		
		double number4 = number1 + number2 + number3;
		double number5 = number4 * 0.08;
		double number6 = number4 + number5;
		
		/* String name4 = "Subtotal: ";
		double number4 = 9.01;
		receipt.format(name4, number4);
		
		String name5 = "Tax: ";
		double number5 = 0.63;
		receipt.format(name5, number5);
		
		String name6 = "Total: ";
		double number6 = 9.64;
		receipt.format(name6, number6); */
		
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		receipt.format(name1, number1);
		receipt.format(name2, number2);
		receipt.format(name3, number3);
		receipt.format("Subtotal:", number4);
		receipt.format("Tax:", number5);
		receipt.format("Total:", number6);
		
		System.out.println("\n__________________________________________");
		System.out.println(" * Thank you for your support * ");
	}
	
	public void format(String name, double number)
	{
		System.out.printf("\n* %15s ........ %10.2f ", name, number);
		
	}

}