package WebDriverBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String getText(By locator) {
		return getElement(locator).getText();
	}
	
	public void getDropDownValues(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down: " + optionsList.size());
		for(int i=0 ; i< optionsList.size() ; i++) {
			System.out.println(optionsList.get(i).getText());
		}
	}
	/**
	 * 
	 * @param locator
	 * @param value
	 */
	public void selectDropdown(By locator, String value) {
		
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
		
	}
	/**
	 * 
	 * @param locator
	 * @param index
	 */
	public void selectDropdown(By locator, int index) {
		
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	/**
	 * 
	 * @param locator
	 * @param value
	 */
	public void selectValuFromDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> valuesList = select.getOptions();
		
		for(int i = 0 ; i < valuesList.size() ; i++) {
		if(valuesList.get(i).getText().equals(value)) {
			valuesList.get(i).click();
			break;			
		    }
		}
		
	}
	
	/**
	 * this method is used to select the value from drop down - without using Select class in Selenium
	 * @param locatorType
	 * @param locator
	 * @param value
	 */
	public void doSelectValue(String locatorType, String locator, String value) {
		List<WebElement> valuesList = null;
		if (locatorType.equals("xpath")) {
			valuesList = driver.findElements(By.xpath(locator));	
		}
		if (locatorType.equals("css")) {
			valuesList = driver.findElements(By.cssSelector(locator));	
		}
		
		System.out.println("total values in the list: " + valuesList.size());
		
		for(int i = 0 ; i < valuesList.size() ; i++) {
			if(valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;			
			    }
			}
	}
	/**
	 * 
	 * @param locator
	 * @return
	 */
	public List<String> getDropDownValuesByLocator(By locator) {
		List<String> ar = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
 		for(int i=0 ; i< optionsList.size() ; i++) {
			ar.add(optionsList.get(i).getText());
		}
		return ar ;
	}

}
