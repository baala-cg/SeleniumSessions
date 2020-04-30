package WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://londonfreelance.org/courses/frames/index.html");  
		
		/**
		 * Frame is also a web element and does have all the attributes like name, id etc., 
		 * frame or iframe
		 * from one frame to main page using defaultContent and then to other frame
		 */
		//driver.switchTo().frame("main");  //or   | recommended    name attribute
		
		//driver.switchTo().frame(2);		  // or       index
		
		driver.switchTo().frame(0);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("main")));     // Web Element

		String text = driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(text);
		
		//driver.switchTo().defaultContent();		// control back to main page from frame
		
		//List<WebElement> frames = driver.findElements(By.tagName("frame"));

		
		
		driver.quit();
		
	}

}
