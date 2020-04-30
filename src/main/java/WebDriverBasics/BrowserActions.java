package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserActions {

	WebDriver driver ;

	/**
	 * This method is used to launch the browser or initialize the driver on the basis of given browser
	 * @param browser
	 */
	public WebDriver launchBrowser(String browser) {
	
		switch (browser) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	case "ie":
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		break;

	default:
		System.out.println("browser not found -->" + browser);
		break;
	}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;

	}

	
	/**
	 * Method used to launch Url
	 * @param url
	 */
	public void launchUrl(String url) {
		driver.get(url);
	}
	
	/**
	 * Returns Title of the Browser
	 * @return
	 */
	public String doGetTitle() {
		return driver.getTitle();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}
