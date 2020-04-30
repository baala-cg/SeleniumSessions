package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();   //launch chrome
		
		//both the statements below are correct
		
		driver.get("http://www.facebook.com");   //launch url
		//driver.get("http://google.com");    	 //launch url       

		String title = driver.getTitle();     //get Page title
		System.out.println("title of the Browser is: " + title);
		
		//validation of actual vs expected output
		if(title.equals("Google")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is incorrect");
		}
		
		driver.quit();
	
	}

}
