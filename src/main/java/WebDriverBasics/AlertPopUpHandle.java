package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		String alertText = driver.switchTo().alert().getText();  //Alert is an Interface
		
		System.out.println(alertText);
		
		if (alertText.equals("Please enter a valid user name")) {
			System.out.println("correct error msg");
		}
		else {
			System.out.println("incorrect error msg");
		}
		Thread.sleep(5000);
		driver.switchTo().alert().accept();		// clicks on OK button
		
		//driver.switchTo().alert().dismiss();  // executes Escape key
		
		driver.quit();
		
		
	}

}
