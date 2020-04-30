package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();   //launch chrome
		
		driver.get("http://www.google.com");   //launch url
		
		/**
		 *  driver.get() - will wait for entire web page to load
		 *  driver.close() - will not wait for entire web page to load and executes next statement
		 */
		driver.navigate().to("http://www.rediff.com");
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.quit();
		
	}

}
