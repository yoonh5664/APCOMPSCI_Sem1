import java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(String distance, String hours, String minutes)
	{
		mph = 0;
	}
	
	public void setValues(String distance, String hours, String minutes)
	{
		mph = 0;
	}
	
	public String getMPH()
	{
		return mph;
		mph = Math.round(distance / (hours + minutes / 60.0));
	}
}