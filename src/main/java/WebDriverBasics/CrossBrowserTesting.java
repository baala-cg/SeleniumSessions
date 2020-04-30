package WebDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {

	String browser = "ie";
	WebDriver driver = null ;
			
	if(browser.equalsIgnoreCase("chrome")) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\JyothiKrishna\\Downloads\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")){
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\JyothiKrishna\\Downloads\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("ie")){
		WebDriverManager.iedriver().setup();
		
		// Set desired capabilities to Ignore IEDriver zoom level settings and disable native events.
		  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		  //caps.setCapability("EnableNativeEvents", false);
		  caps.setCapability("ignoreZoomSetting", true);

		  // Initialize InternetExplorerDriver Instance using new capability.
		  driver = new InternetExplorerDriver(caps);
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  //driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
	}
	else if(browser.equalsIgnoreCase("safari")){
		WebDriverManager.getInstance(SafariDriver.class).setup();
		driver = new SafariDriver();
	}
	else {
		System.out.println("browser not found-- " + browser);	
		}
	
	//driver.get("http://www.google.com");   //launch url
	//driver.get("http://google.com");    	 //launch url       

	driver.navigate().to("http://www.google.com");
	String title = driver.getTitle();     //get Page title
	System.out.println("title of the Browser is: " + title);
	
	//validation of actual vs expected output
	if(title.equals("Google")) {
		System.out.println("title is correct");
	}
	else {
		System.out.println("title is incorrect");
	}
	driver.quit();
	}
}
