import java.util.Scanner;
public class MilesPerHourRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance: ");
		int distance = kb.nextInt();
		System.out.println("Please enter the hours: ");
		int hours = kb.nextInt();
		System.out.println("Please enter the minutes: ");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours, " + object.getMinutes() + " minutes = " + object.getMilesPerHour(distance, hours, minutes) + " mph");
		object.setMilesPerHours(12, 1, 30);
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours " + object.getMinutes() + " minutes = " + object.getMilesPerHour(12, 1, 30) + " mph");
	}
}	
	