package WebDriverBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		List<WebElement> optionsList = driver.findElements(By.xpath("//ul//li[contains(@class,'context-menu-icon')]/span"));

		//doRightClick(optionsList, "Quit", driver, rightClick);
		
		ArrayList<String> ar2= getRightClickOptions(optionsList, driver, rightClick);

		System.out.println("values in the list: " + ar2);
	}

	public static void doRightClick(List<WebElement> optionsList, String value, WebDriver driver, WebElement element) {
		
		Actions action = new Actions(driver);
				
		action.contextClick(element).build().perform();
		
		System.out.println("total number of list options: " + optionsList.size());
		for(int i=0 ; i < optionsList.size() ; i++) {
			String text = optionsList.get(i).getText();
			System.out.println(i + "-->" + text);
			
			if(text.equals(value)) {
				optionsList.get(i).click();
				break;
			}
		}
		
	}
	
public static ArrayList<String> getRightClickOptions(List<WebElement> optionsList,  WebDriver driver, WebElement rightClick) {
		
	ArrayList<String> ar = new ArrayList<String>();
		Actions action = new Actions(driver);
				
		action.contextClick(rightClick).build().perform();
		
		System.out.println("total number of list options: " + optionsList.size());
		for(int i=0 ; i < optionsList.size() ; i++) {
			String text = optionsList.get(i).getText();
			ar.add(text);
		}
		return ar;
	}
}
