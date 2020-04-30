package WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling_2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob = "23-Nov-1975";
		
//		selectValuFromDropDown(day, "15");
//		selectValuFromDropDown(month, "Jul");
//		selectValuFromDropDown(year, "1990");
		
		selectValuFromDropDown(day, dob.split("-")[0]);
		selectValuFromDropDown(month, dob.split("-")[1]);
		selectValuFromDropDown(year, dob.split("-")[2]);
		
	}

	public static void selectValuFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		List<WebElement> valuesList = select.getOptions();
		
		for(int i = 0 ; i < valuesList.size() ; i++) {
		if(valuesList.get(i).getText().equals(value)) {
			valuesList.get(i).click();
			break;			
		    }
		}
		
	}
	
}
