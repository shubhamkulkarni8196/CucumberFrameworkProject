package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestUtility;

public class LandingpageLocator {
	
	By search = By.xpath("//input[@type='search']");
	
	By Landingpageproductname = By.xpath("//h4[text()='Tomato - 1 Kg']");

	By topdeal = By.xpath("//a[text()='Top Deals']");
	
	public WebDriver driver;
	
	public LandingpageLocator(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void enterSearch(String name) {
		
		driver.findElement(search).sendKeys(name);

	}
	
	public String getLandingproduct() {
	 
		return driver.findElement(Landingpageproductname).getText();
		
	}
	
	public void clickTopdeal() {
		
		driver.findElement(topdeal).click();
	}
	
}
