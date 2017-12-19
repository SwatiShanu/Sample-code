package ClearTrip.PageLocators;

import org.openqa.selenium.By;

public class SearchResultPageLocators {
	
	protected By HOTEL_RESULTS = By.xpath("//*[@class='hotelsList']/ul/li[position()=1]");
	protected By HOTEL_NAME = By.xpath(".//h2/a[@class='hotelDetails']");
	protected By PRICE = By.xpath(".//*[@id='perRoomPrDisp']/strong");
    protected By TAX = By.xpath(".//small[@class='additionalTaxes']");
    protected By ADDRESS = By.xpath(".//small[@class='areaName truncate']");

}
