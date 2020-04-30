package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		//action.dragAndDrop(source, target).build().perform();   //or      we can use only perform() for statements having only one action
		
		action.clickAndHold(source).moveToElement(target).release().build().perform();   //or
		
		//action.clickAndHold(source).moveToElement(target).release(target).build().perform();   //not sure whether its right way but it's working


		
		
		
	}

}
