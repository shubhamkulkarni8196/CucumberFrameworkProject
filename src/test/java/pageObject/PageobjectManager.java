package pageObject;

import org.openqa.selenium.WebDriver;

public class PageobjectManager {
	
	public LandingpageLocator landingpageLocator;
	
	public OfferpageLocator offerpageLocator;
	
	public WebDriver driver;
	
	public PageobjectManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
   public LandingpageLocator getlandingpage() {
	   
	   return landingpageLocator = new LandingpageLocator(driver);
   }

   
   public OfferpageLocator getOfferpage() {
	   
	   return offerpageLocator = new OfferpageLocator(driver);
   }
}
