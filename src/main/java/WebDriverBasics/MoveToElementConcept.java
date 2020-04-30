package WebDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
//		
//		
//		WebElement contentLink = driver.findElement(By.className("menulink"));
		Actions action = new Actions(driver);
//		
//		action.moveToElement(contentLink).perform();
//		
//		driver.findElement(By.linkText("COURSES")).click();
//		Thread.sleep(5000);
//		driver.navigate().back();
//		
//		contentLink = driver.findElement(By.className("menulink"));
//		
//		action.moveToElement(contentLink).build().perform();
//
//		driver.findElement(By.partialLinkText("SINGL")).click();
//		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(6000);

		WebElement login = driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		
		
		//Thread.sleep(6000);
		action.moveToElement(login).build().perform();
		Thread.sleep(5000);
////
		WebElement clubMembers = driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));
////		
		action.moveToElement(clubMembers).build().perform();;
		Thread.sleep(7000);
////
		//driver.findElement(By.xpath("//a[text()='SpiceClub Members']//following-sibling::ul/a")).click();
		
		boolean flag = driver.findElement(By.xpath("//a[contains(text(),'Member Login')]")).isDisplayed();
		System.out.println(flag);
		
		action.doubleClick(login).build().perform();  //to double click on any element
////		
//		
		
		

	}

}
