import java.util.Scanner;
public class practice
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter item1: ");
		String item1 = kb.next();
		System.out.println("Please enter the price: ");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item2: ");
		String item2 = kb.next();
		System.out.println("Please enter the price: ");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item3: ");
		String item3 = kb.next();
		System.out.println("Please enter the price: ");
		double price3 = kb.nextDouble();
		System.out.println("Please enter item4: ");
		String item4 = kb.next();
		System.out.println("Please enter the price: ");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = discount + tax;
		 
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		//print line items
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		
		//print subtotal, discount, tax, total
		format("Subtotal: ", subtotal);
		format("Discount: ", discount);
		format("Tax: ", tax);
		format("Total: ", total);
		
		System.out.println("\n__________________________________________");
		System.out.println(" * Thank you * ");
	}
	
	public static double calcDisc(double sub)
	{
		if (sub >= 2000)
			return sub * 0.15;
		return 0.0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n* %15s ........ %10.2f ", item, price);
	}
}

import java.util.Scanner;
public class Adventure
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Welcome to Adventure World where you get to choose your own adventure. Would you like to..." +
							"\n 1. Take a walk" +
							"\n 2. Stay at home");
		int choice = kb.nextInt();			
		if(choice == 1)
			System.out.println("Would you like to..." +
								"\n a. Walk to a friend's house" +
								"\n b. Take a stroll around the neighborhood" +
								"\n c. Walk to a market");
								
			String answer = kb.next();
		{
			if (choice.equals("a"))
			{
				System.out.println("You run into a zombie. The zombie eats you and you die.");
				if (choice.equals("b"))
					System.out.println("You pass by a cute dog. Would you like to pet it?");
				else 
					System.out.println("");
			}
			else 
			{	
				System.out.println("You walk to a market.");
				if (choice.equals("c"))
					System.out.println("You buy food at the market and you are forever happy!");
				else 
					System.out.println("");
			}
		}	
		else 
			System.out.println("Would you like to..." +
								"\n a. Take a nap" +
								"\n b. Play video games" +
								"\n c. Go on the computer");
			if(choice.equals("a"))
			{
					System.out.println("You feel very happy and energized after your nap");
				if (choice.equals("b"))
					System.out.println("You feel very tired from looking at the screen for many hours");
				else 
					System.out.println("");
			}
			else 
				System.out.println("You go on the computer");
				if (choice.equals("c"))
					System.out.println("You feel very happy from talking to your friends online");
				else 
					System.out.println("");
		}				
}