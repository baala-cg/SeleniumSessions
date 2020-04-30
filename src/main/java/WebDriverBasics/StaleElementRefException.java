package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefException {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com");
		
		WebElement email = driver.findElement(By.name("username"));
		// WebElement email ID v1 value - cc70d157-1b69-4d4b-9393-78967f6c9e25
		
		email.sendKeys("naveenk");
		
		driver.navigate().refresh();
		
		//email.sendKeys("seleniumUser");  //Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document

		email = driver.findElement(By.name("username"));
		// WebElement email ID v2 value - 2b066784-ab44-4c4b-9eea-177deaa057f3
		email.sendKeys("balu");
	}

}
