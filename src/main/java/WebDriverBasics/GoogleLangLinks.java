package WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLangLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.in");
		
		List<WebElement> gLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));	
		int linkCount = gLinks.size();
		System.out.println(linkCount);
		
		for(int i =0 ; i< linkCount ; i++) {
			String linkText = gLinks.get(i).getText();
			System.out.println(linkText);
			gLinks.get(i).click();
			Thread.sleep(3000);
			//gLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));  //we need to load the updated DOM after clicking on the link
			//or
			driver.navigate().back();
			Thread.sleep(2000);
			gLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}
		
	}

}
