package utils;

import org.openqa.selenium.WebDriver;

import pageObject.PageobjectManager;

public class TestUtility {

	public WebDriver driver;
	public String landingPageProdcyname;
	public String offrePageProdctname;
    public PageobjectManager pageobjectManager;
	
	public PageobjectManager getPageobjectmanager() {
		
		return pageobjectManager = new PageobjectManager(driver);
	}
}
