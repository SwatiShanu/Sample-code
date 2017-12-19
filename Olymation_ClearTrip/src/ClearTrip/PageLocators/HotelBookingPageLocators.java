package ClearTrip.PageLocators;

import org.openqa.selenium.By;

public class HotelBookingPageLocators {
	protected By WHERE = By.cssSelector("#Tags");
	//protected By CITY = By.cssSelector("#City");
	protected By DATEICON = By.cssSelector("i.calendarIcon.datePicker");
	protected By CHECK_IN_DATE = By.cssSelector("#SearchForm > section.row.fieldRow.searchBox > div:nth-child(1) > dl > dd > div > i");
    protected By CHECK_OUT_DATE = By.cssSelector("#SearchForm > section.row.fieldRow.searchBox > div:nth-child(2) > dl > dd > div > i");
    protected By TRAVELLER_DETAILS = By.cssSelector("#travellersOnhome");
	protected By MORE_TRAVELLERS = By.id("");
	protected By SELECT_CHILDREN = By.cssSelector("#Childs_1");
	protected By CHILD_AGE = By.cssSelector("#AgeChild1 > dd > select");
	protected By SEARCH_HOTELS_BUTTON = By.cssSelector("#SearchHotelsButton");
				


}
