package testData;

public class travelerInformation 
{
	public static String getTravelerName()
	{
		String name = System.getProperty("travelerName");
		return name;
	}
	public static String getTravelerEmail()
	{
		String email = System.getProperty("travelerEmail");
		return email;
	}
}
