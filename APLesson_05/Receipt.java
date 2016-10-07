import java.util.Scanner;
public class Receipt
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1");
		String item1 = kb.next();
		System.out.println("Please enter the price");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item 2");
		String item2 = kb.next();
		System.out.println("Please enter the price");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item 3");
		String item3 = kb.next();
		System.out.println("Please enter the price");
		double price3 = kb.nextDouble();
		System.out.println("Please enter item 4");
		String item4 = kb.next();
		System.out.println("Please enter the price");
		double price4 = kb.nextDouble();
		double subtotal = (price1 + price2 + price3 + price4);
		System.out.println("Subtotal = " + subtotal );
		
		
			
		double tax = .075;
		double total = (subtotal - discount + tax);
		
	public static void discount()
	{
		if(subtotal > 2000)
		{
			System.out.println("Discount: 15%");
		}	
		if(subtotal < 2000)
		{
			System.out.println("Discount: 0%");
		}	
	}
		
		
	}
}

