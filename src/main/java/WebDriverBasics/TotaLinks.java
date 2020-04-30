 package WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotaLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksCount = links.size() ;
		System.out.println("tota no of links are: " + linksCount);
		
		for(int i =0; i< linksCount ; i++) {
			String linkText = links.get(i).getText();
			//System.out.println(i + "-->" + linkText );
			
			if(! linkText.isEmpty()) {
				System.out.println(i + "-->" + linkText + "-->");
				System.out.println(links.get(i).getAttribute("href"));
				
			}
		}
		
	}

}
