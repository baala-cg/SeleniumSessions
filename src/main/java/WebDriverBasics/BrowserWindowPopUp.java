package WebDriverBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");  
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id is : " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id is : " + childWindowId );
		
		driver.switchTo().window(childWindowId);
		
		String childTitle = driver.getTitle();
		System.out.println("child window page title is: " + childTitle);
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		String parentTitle = driver.getTitle();
		System.out.println("parent window page title is: " + parentTitle);
		
		
		
		
		
		
	}

}
