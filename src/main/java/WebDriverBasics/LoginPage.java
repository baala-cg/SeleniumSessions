package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//By locators -- page objects
	
	static By emailId = By.id("username");
	static By password = By.id("password");
	static By loginButton = By.id("loginBtn");
	By signUpLink = By.linkText("Sign up");
	static By homePageHeader = By.className("private-page__title"); //or
	//static By homePageHeader = By.cssSelector("h1.private-page__title"); //tagnameValue.classNameValue
	//static By signInGoogle = By.className("buttonText");
	
	public static void main(String args[]) throws InterruptedException {
		BrowserActions br = new BrowserActions();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://app.hubspot.com/login");
		Thread.sleep(5000);
		ElementUtil elementUtil = new ElementUtil(driver);
		/*elementUtil.getElement(LoginPage.emailId).sendKeys("test@gmail.com");
		elementUtil.getElement(password).sendKeys("password");
		elementUtil.getElement(loginButton).click();
		*/
		//elementUtil.doClick(signInGoogle);
		elementUtil.doSendKeys(emailId, "baala.cg@gmail.com");
		elementUtil.doSendKeys(password, "CapG@123");
		
		elementUtil.doClick(loginButton);
		
		Thread.sleep(10000);
		String header = elementUtil.getText(homePageHeader);
		System.out.println("home page header is: " + header);
		
		if(header.equals("Sales Dashboard")) {
			System.out.println("login successful");
		}
		else {
			System.out.println("login un-successful");
		}
		
		String title = br.doGetTitle();
		System.out.println("page of title is: " + title);
		
		br.quitBrowser();
		
	}
	
}
