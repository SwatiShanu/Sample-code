package ClearTrip.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ClearTrip.Commons.Common;
import ClearTrip.PageLocators.HotelBookingPageLocators;

public class HotelBookingPage extends HotelBookingPageLocators{
	
	WebDriver driver;
	public HotelBookingPage(WebDriver driver){
		this.driver = driver;
	}
	
public  void FillDetails(){
	    
	
		Properties prop = Common.readPropertiesFile();
		driver.findElement(WHERE).clear();
		driver.findElement(WHERE).sendKeys(prop.get("Where").toString());
		Common.waitFor(2);
		driver.findElement(WHERE).sendKeys("" + Keys.DOWN + Keys.TAB); 
		driver.findElement(By.cssSelector("div.searchForm > h1")).click();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> DATEICONS = driver.findElements(DATEICON);
		DATEICONS.get(0).click();
		driver.findElements(By.cssSelector("div.last td.weekEnd")).get(0).click();
		DATEICONS.get(1).click();
		driver.findElements(By.cssSelector("div.last td.weekEnd")).get(1).click();
		
		Select travellerDetails = new Select(driver.findElement(TRAVELLER_DETAILS));
		travellerDetails.selectByValue("MoreTravellers");
		
		Select child = new Select(driver.findElement(SELECT_CHILDREN));
		child.selectByVisibleText("1");
		
		Select age = new Select(driver.findElement(CHILD_AGE));
		age.selectByVisibleText("11");
		
		driver.findElement(SEARCH_HOTELS_BUTTON).click();		
	}
	

	
}
