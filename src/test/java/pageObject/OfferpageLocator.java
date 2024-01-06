package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestUtility;

public class OfferpageLocator {
	
	By searchfield = By.xpath("//input[@id='search-field']");
	
	By Offerpageproductname = By.xpath("//tr//td[1]");
	
	public WebDriver driver;
	
	public OfferpageLocator(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void enterSearchOffer(String name) {
		
		 driver.findElement(searchfield).sendKeys(name);

	}
	
	public String getofferpageproduct() {
	 
		return driver.findElement(Offerpageproductname).getText();
		
	}
	
}
