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
	
	public MilesPerHour(int D, int H, int M)
	{
		distance = D;
		hours = H;
		minutes = M;
		mph = 0;
	}
	
	public void setValues(int D, int H, int M)
	{
		distance = D;
		hours = H;
		minutes = M;
		mph = 0;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}