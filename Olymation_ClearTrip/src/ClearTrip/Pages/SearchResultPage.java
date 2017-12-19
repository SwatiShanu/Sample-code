package ClearTrip.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ClearTrip.Commons.Common;
import ClearTrip.PageLocators.SearchResultPageLocators;

public class SearchResultPage extends SearchResultPageLocators{

	WebDriver driver;
	public SearchResultPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void getDetails(){

		String hotel_name = new String(), price = new String(), tax = new String(), address = new String();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Common.waitFor(3);
		
		WebElement parent = driver.findElement(HOTEL_RESULTS);
		hotel_name = parent.findElement(HOTEL_NAME).getText();
		price = parent.findElement(PRICE).getText();

		if(Common.findElementWithinParent(parent, TAX))
			tax = parent.findElement(TAX).getText();
		if(Common.findElementWithinParent(parent, ADDRESS))
			address = parent.findElement(ADDRESS).getText();

		Common.saveScreenshot(driver);
		System.out.println("Details are : \nHotel Name = "+hotel_name+"\nPrice = "+price);
		if(tax.length()>0)
			System.out.println("\nTAX = "+tax);
		if(address.length()>1)
			System.out.println("\nAddress = "+address);
	}	



}
