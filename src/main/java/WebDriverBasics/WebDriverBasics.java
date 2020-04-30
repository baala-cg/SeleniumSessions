package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JyothiKrishna\\Downloads\\chromedriver.exe");	
		
		// Top Casting : Interface is Parent and ChromeDriver is child
		WebDriver driver = new ChromeDriver();   //launch chrome
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
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
		
		System.out.println(driver.getCurrentUrl());
		
		String url = driver.getCurrentUrl();
		if(url.contains("google")) {
			System.out.println("correct url");
		}
		else {
			System.out.println("incorrect url");
		}
		
		//get the page source
		//System.out.println(driver.getPageSource());
		
		//quit the browser
		driver.quit();
	}

}
