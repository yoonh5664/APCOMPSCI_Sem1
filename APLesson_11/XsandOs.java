public class XsandOs
{
	public static void main(String[]args)
	{
		String [][] xAnd0 = new String[4][4];
	
		for(int i = 0; i < xAnd0.length; i++)
		{
			for(int j = 0; j < xAnd0[i].length; j++)
			{
				int pick = (int)(Math.random() * 2) + 1;
				if(pick == 1)
				{
					xAnd0[i][j] = "x";
				}
				else
				{
					xAnd0[i][j] = "o";
				}
				System.out.print(xAnd0[i][j] + "\t");
			}
			System.out.println();
		}
	}
}