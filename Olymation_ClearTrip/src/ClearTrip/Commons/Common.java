package ClearTrip.Commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author dthorecha
 * Class is used to define common used methods/properties across Tests
 */
public class Common {


	private static String browser = new String();

	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		Common.browser = browser;
	}

	/**
	 * Use this method to create/invoke WebDriver for any Browser-Name
	 * @param browser - Takes String name of Browser
	 * @return - WebDriver object for Browser
	 */
	public static WebDriver getMyBrowser(String browser){

		setBrowser(browser);

		if(browser.contentEquals("FF"))
			return new FirefoxDriver();
		else if(browser.contentEquals("CHROME")){
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			return new ChromeDriver();
		}
		else
			return null;
	}

	public static void saveScreenshot(WebDriver driver){
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void waitFor(int sec){
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean findElementWithinParent(WebElement parent, By child){
		try{
			if(parent.findElement(child).isDisplayed())
				return true;
			else
				return false;
		}catch(Exception e){
			return false;
		}
	}

	/**
	 * @author Prabhasis
	 * Defines useful URLs for Test
	 */
//	public static class URL{
		public static final String CLEARTRIP_HOME = "https://www.cleartrip.com/";
//	}


	public static Properties readPropertiesFile(){
		try {
			File file = new File("resources\\Input.properties");
			FileInputStream fileInput = new FileInputStream(file);

			Properties properties = new Properties();
			properties.load(fileInput);
			return properties;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
