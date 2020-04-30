package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\JyothiKrishna\\Desktop\\Courses.txt");  
		// this concept works only if type = file attribute is available, its mandatory
		
		// Other alternatives would be Auto It or Sikuli
		// Auto It will not run on Jenkins or Unix or Max or Linux, Auto It is only for Windows
		// Robot class also will not work
		
		
		
		
		
		
	}

}
