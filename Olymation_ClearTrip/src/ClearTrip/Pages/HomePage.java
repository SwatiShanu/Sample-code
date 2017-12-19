package ClearTrip.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import ClearTrip.PageLocators.HomePageLocators;

public class HomePage extends HomePageLocators{
	
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public HomePage HotelsTab(){
		
		List<WebElement> list = driver.findElements(Hotels_TAB2);
		list.get(1).click();
		//list.
		//driver.findElement(HOTELS_TAB).click();
		Reporter.log("Clicking HOTELS TAB");
		return this;
	}
	
}
