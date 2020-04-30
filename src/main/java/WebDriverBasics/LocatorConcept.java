package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		 driver.get("https://app.hubspot.com/login");
		 // driver.get("https://classic.crmpro.com");
		 //driver.get("https://freshworks.com");

		Thread.sleep(5000);
		
		// Create webelement and perform action on the web element.
		
		//1. id locator/attribute:  -->Preference - 1
		/*driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();
*/
		
		/*WebElement email = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement button = driver.findElement(By.id("loginBtn"));
		
		email.sendKeys("test@gmail.com");
		password.sendKeys("test@123");
		button.click();*/
		
		//2 . name locator /attribute:  -->Preference - 2
		/*driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		WebElement email = driver.findElement(By.name("username")) ;
		*/

		//3. className locator/ attribute:  -->Preference - 4
		//class attribute value for username -"form-control private-form__control login-email"
		//class attribute value for password - "form-control private-form__control login-password m-bottom-3"
		//we need to select the unique value among 3 values separated by space
		/*driver.findElement(By.className("login-email")).sendKeys("test");
		//driver.findElement(By.className("m-bottom-3")).sendKeys("password");     //anyone would work
		driver.findElement(By.className("login-password")).sendKeys("password");   //anyone would work
*/
		//4. Xpath is a locator but not an attribute:  -->Preference - 3
		// this is the address of the element in DOM (Document Object Model)
		
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password1");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
*/
		//5. cssSelector is a locator but not an attribute:  -->Preference - 3
		/*driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("password2");
		driver.findElement(By.cssSelector("#loginBtn ")).click();
		*/
		
		//6. linktext is a locator and not attribute -- only for links:
		//href - hyperlink reference
		
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("uid-firstName-5")).sendKeys("Tom");
		driver.findElement(By.id("uid-lastName-6")).sendKeys("John");
		driver.findElement(By.id("uid-email-7")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//7. partialLinkText -- only for links
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		//Sign up  --1st element available in the DOM from top would be picked up
		//Sign in
		
		//8. tagName:
		/*String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
*/	}

}
