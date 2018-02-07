package Day_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeMethod  
	public void UseridGeneration()
	{
		System.out.println("User id b Generation");
	}
	@BeforeTest
	public void Cookies()
	{
		System.out.println("Delete the Cookies before start test");
	}
	@AfterTest
	public void CookiesClose()
	{
		System.out.println("Delete cookies after complete the all test");
	}
	
	@Test
	public void AOpeningBrowser()
	{
		System.out.println("Opening Browser");
		
	}
	@Test
	public void FlightBooking()
	{
		System.out.println("Flight Booking");
	}

}
