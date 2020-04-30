package WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DroDownHandlingWithoutSelectClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
//		String dayXpath = "//select[@id='day']/option";
//		String monthXpath = "//select[@id='month']/option";
//		String yearXpath = "//select[@id='year']/option";
//		
		String dob = "25-Nov-1976";
		
//		doSelectValue(driver, "xpath", dayXpath, dob.split("-")[0]);
//		doSelectValue(driver, "xpath", monthXpath, dob.split("-")[1]);
//		doSelectValue(driver, "xpath", yearXpath, dob.split("-")[2]);
		
		String dayCss   =   "select#day option";
		String monthCss =   "select#month option";
		String yearCss  =   "select#year option";
		
		doSelectValue(driver, "css", dayCss, dob.split("-")[0]);
		doSelectValue(driver, "css", monthCss, dob.split("-")[1]);
		doSelectValue(driver, "css", yearCss, dob.split("-")[2]);
	}

	public  static void doSelectValue(WebDriver driver, String locatorType, String locator, String value) {
		List<WebElement> valuesList = null;
		if (locatorType.equals("xpath")) {
			valuesList = driver.findElements(By.xpath(locator));	
		}
		if (locatorType.equals("css")) {
			valuesList = driver.findElements(By.cssSelector(locator));	
		}
		
		System.out.println("total values in the list: " + valuesList.size());
		
		for(int i = 0 ; i < valuesList.size() ; i++) {
			if(valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;			
			    }
			}
	}
	
	
	
}
