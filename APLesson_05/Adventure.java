import java.util.Scanner;
public class Adventure
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Welcome to Adventure World where you get to choose your own adventure. You find 3 path. There is 3 paths: right, left, and straight. Would you like to..." +
							"\n 1. Go left" +
							"\n 2. Go right" +
							"\n 3. Go straight");
		int choice = kb.nextInt();
		if(choice == 1)
		{
			System.out.println("You see a castle. Would you like to..." +
								"\n 1. Enter the castle" +
								"\n 2. Keep following the path");
			int answer = kb.nextInt();
			if (answer == 1)
			{
				System.out.println("Would you like to enter the castle? Yes or No?");
				String answer1 = kb.next();
				if (answer1.equals("Yes"))
					System.out.println("You friend a princess and you make a new friend.");
				else
					System.out.println("You aimlessly walk arond the castle. The guards think you are suspicious. They shoot you and you die.");
			}
			else
			{
				System.out.println("A man offers a ride on his horse. What is your response: Yes or No?");
				String answer2 = kb.next();
				if (answer2.equals("Yes"))
					System.out.println("The man is actually a serial killer. He takes you to his house and kills you. You are dead.");
				else
					System.out.println("The man is offended that you declined his offer. He shoots you with his gun and you die.");
				
			}
				
		}
		else if(choice == 2)
		{
			System.out.println("You see a bear in front of you. Would you like to..." +
									"\n 1. Fight it" +
									"\n 2. Run away from it");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{
				System.out.println("Would you like to punch it? Yes or No?");
				String answer3 = kb.next();
				if (answer3.equals("Yes"))
					System.out.println("The bear is weighs 1,300 pounds. It is much stronger then you. Your punch does not affect the bear at all. The bear attacks you after your first punch. The bear kills you. You are dead. ");
				else
					System.out.println("None of your other forms of attacks are as strong as your punches. The bear kills you in an instant. You are dead. ");
			}
			else
			{
				System.out.println("Would you like to hide behind a tree? Yes or No?");
				String answer4 = kb.next();
				if (answer4.equals("Yes"))
					System.out.println("You fall on the tree roots. The bear sees you and it walks towards you. It is actually a kind bear that loves humans. It hugs you and you feel forever loved. ");
				else
					System.out.println("The bear runs and catches up to you. It attacks you and you die. ");
			}
		}	
		else if(choice == 3)
		{
			System.out.println("You see a grandma with a basket full of apples Would you like to..." +
									"\n 1. Talk to her" +
									"\n 2. Steal her basket");
			int choice3 = kb.nextInt();
			if (choice3 == 1)
			{
				System.out.println("She offers you an apple. Would you like to eat the apple? Yes or No?");
				String answer5 = kb.next();
				if (answer5.equals("Yes"))
					System.out.println("The apple is poisonous. You eat it and die. ");
				else
					System.out.println("The grandma offers you to come into her house and you make small talk. Because you are so polite to her she decides not to kill you. ");
			}
			else
			{
				System.out.println("Would you like to run? Yes or No?");
				String answer6 = kb.next();
				if (answer6.equals("Yes"))
					System.out.println("The grandma is actually a witch. She puts a spell on you and you turn into a mouse. She feeds you to her snake and you die. ");
				else
					System.out.println("You nonchalantly walk away. She is offended and kills you. You are dead. ");
				
			}	
				
		}	
	}
	
}	