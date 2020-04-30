package WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		
		List<WebElement> imgs = driver.findElements(By.tagName("img"));
		int imgsCount = imgs.size() ;
		System.out.println("tota no of images are: " + imgsCount);
		
		for(int i=0 ; i< imgsCount ;i++ ) {
			String img = imgs.get(i).getAttribute("src");
			System.out.println(img);
		}
		driver.quit();
		
		
	}

}
