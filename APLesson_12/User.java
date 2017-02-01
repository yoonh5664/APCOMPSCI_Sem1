public class User
{
	private String firstName, lastName, avatar;
	private int userID;
	
	public User()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
	public User(String F, String L)
	{
		firstName = F;
		lastName = L;
		avatar = A;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setAvatar(String A)
	{
		avatar = A;
	}
	
	public String toString()
	{
		return "Customer Info... \nFirst Name: " + firstName +
														"\nLast Name: " + lastName +
														"\nAvatar: " + avatar +
														"\nUser ID#: " + userID;
	}
}