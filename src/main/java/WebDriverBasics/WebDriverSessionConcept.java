package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
/*
 *   driver.close() & driver.quit()
 */
public class WebDriverSessionConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();   //launch chrome
		//Session ID - ChromeDriver: chrome on WINDOWS (ec6d11723a52513ac0891e94b5f5f871)	
		
		driver.get("http://www.facebook.com");   //launch url
		//Session ID - ChromeDriver: chrome on WINDOWS (ec6d11723a52513ac0891e94b5f5f871)
		
		String title = driver.getTitle();     //get Page title
		// ChromeDriver: chrome on WINDOWS (ec6d11723a52513ac0891e94b5f5f871)
		
		System.out.println("title of the Browser is: " + title);
		
		
		//quit the browser
		//driver.quit();  // Session ID would be null
		// ChromeDriver: chrome on WINDOWS (null)
		//System.out.println(driver.getTitle());  //Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

		
		driver.close();  //Session ID would be expired
		//Session ID - ChromeDriver: chrome on WINDOWS (ec6d11723a52513ac0891e94b5f5f871)

		System.out.println(driver.getTitle());    //Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
	}

}
