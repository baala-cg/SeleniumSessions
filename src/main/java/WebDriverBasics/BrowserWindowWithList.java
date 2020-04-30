package WebDriverBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowWithList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");  
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();   // doesn't have indexing, hence iterator needs to be used to get all elements
		
		List<String> handlesList = new ArrayList<String>(handles); // have indexing , we can call elements with index and can use for loop
		
		int count = handlesList.size();
		System.out.println("no of windows are: " + count);
		String parentWindowId = handlesList.get(0);
		System.out.println("parent window id: " + parentWindowId);
		String childWindowId = handlesList.get(1);
		System.out.println("child window id: " + childWindowId);
		
		
	}

}
