package ClearTrip.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ClearTrip.Commons.Common;
import ClearTrip.Pages.HomePage;
import ClearTrip.Pages.HotelBookingPage;
import ClearTrip.Pages.SearchResultPage;

public class ClearTripHotelBooking {

	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void initDriver(String browser){
		this.driver = Common.getMyBrowser(browser);
		System.out.println("Creating Browser Session for: "+Common.getBrowser());
	}
	
	@Test
	public void test(){
		driver.get(Common.CLEARTRIP_HOME); //Common.URL.CLEARTRIP_HOME
		new HomePage(driver).HotelsTab();
		new HotelBookingPage(driver).FillDetails();
		new SearchResultPage(driver).getDetails();
		driver.quit();
	}

	

	
	
}
