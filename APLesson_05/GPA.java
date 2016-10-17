import java.util.Scanner;
public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please put in math grade");
		String math = kb.next();
		System.out.println("Please put in science grade");
		String science = kb.next();
		System.out.println("Please put in english grade");
		String english = kb.next();
		System.out.println("Please put in history grade");
		String history = kb.next();
		System.out.println("Please put in language grade");
		String language = kb.next();
		System.out.println("Please put in comp sci grade");
		String compsci = kb.next();
		System.out.println("Please put in pe grade");
		String pe = kb.next();
		
		double gPoints = calcPoints(math) + calcPoints(science) + calcPoints(english) + calcPoints(history) +calcPoints(language) + calcPoints(compsci) + calcPoints(pe);
		System.out.println(gPoints/ 7);

	}

	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("F"))
			return 0.0;
		return 0.0;
	}
}