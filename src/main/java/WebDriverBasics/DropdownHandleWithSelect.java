package WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandleWithSelect {

	public static void main(String[] args) {

		// select html tag based drop downs
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		
		Select select = new Select(day);
		select.selectByVisibleText("15");  //recommended
		select.selectByIndex(20);			// index might change if any other value got added in drop down
		select.selectByValue("9");			// value might change if any other value got added in drop down
		
		System.out.println(select.isMultiple());
		
		
		
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("Jun");
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("2010");
		
		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);
		
		
		
		
		selectDropdown(day, "15");
		selectDropdown(month, "Nov");
		selectDropdown(year, "2000");
		
		selectDropdown(day, 0);
		selectDropdown(month, 10);
		selectDropdown(year, 20);
	}

	public static void getDropDownValues(WebElement element) {
		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down: " + optionsList.size());
		for(int i=0 ; i< optionsList.size() ; i++) {
			System.out.println(optionsList.get(i).getText());
		}
	}
	public static void selectDropdown(WebElement element, String value) {
		
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	public static void selectDropdown(WebElement element, int index) {
		
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}
}
