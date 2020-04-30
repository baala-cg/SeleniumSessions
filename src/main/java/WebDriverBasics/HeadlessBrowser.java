package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		/**
		 *  Headless :no browser
		 *  Not visible
		 *  testing is happening behind the scene
		 *  fast
		 */
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions co = new ChromeOptions();
//		//co.addArguments("--headless");
//		co.addArguments("--incognito");
//		
//		WebDriver driver = new ChromeDriver(co);
		
		/**
		 * Firefox Driver
		 */
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		//fo.addArguments("--incognito");
		
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("http://www.google.com");   //launch url

		String title = driver.getTitle();     //get Page title
		System.out.println("title of the Browser is: " + title);
		
		//validation of actual vs expected output
		if(title.equals("Google")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is incorrect");
		}

	}

}
