import java.util.Scanner;
public class ID_Card
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		ID_Card card = new ID_Card();
		
		System.out.println("Enter your first name: ");
		
		String name1 = keyboard.nextLine();
		System.out.println("Enter your last name: ");
		String number2 = keyboard.nextLine();
		System.out.println("Enter your title: ");
		String name3 = keyboard.nextLine();
		System.out.println("Enter the school site: ");
		String name4 = keyboard.nextLine();
		System.out.println("Enter the school year: ");
		String number = keyboard.nextLine();
		System.out.println("What is your subject? ");
		String number3 = keyboard.nextLine();
		
	
		System.out.println("\n***********************************");
		card.format(name4, number);
		card.format(name1, number2);
		card.format(name3, number3);
		
		System.out.println("\n***********************************");
		
	}
	
	public void format(String name, String number)
	{
		System.out.printf("\n* %10s  %10s *", name, number);
		
	}

}