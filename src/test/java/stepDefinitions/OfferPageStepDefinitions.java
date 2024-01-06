package stepDefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingpageLocator;
import pageObject.OfferpageLocator;
import pageObject.PageobjectManager;
import utils.TestUtility;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;
public class OfferPageStepDefinitions {
	
	public WebDriver driver;
	public String landingPageProdcyname;
	public String offrePageProdctname;
	TestUtility testUtility;
	public String offerprodcut;
	
	LandingPageStepDefinitions landingPageStepDefinitions = new LandingPageStepDefinitions(testUtility);
	
	public OfferPageStepDefinitions(TestUtility testUtility) {
		
		this.testUtility=testUtility;
	}
	
	@Then("User enters {string} on profile page")
	public void user_enters_on_profile_page(String name) throws InterruptedException {

		testUtility.getPageobjectmanager().getlandingpage().clickTopdeal();
        
        Set<String> I = testUtility.driver.getWindowHandles();
        Iterator window = I.iterator();
        String parentwindow = (String) window.next();
        String childwindow = (String) window.next();
        testUtility.driver.switchTo().window(childwindow);
		
        
       // OfferpageLocator offerpageLocator = new OfferpageLocator(testUtility.driver);
        
        testUtility.getPageobjectmanager().getOfferpage().enterSearchOffer(name);
        
        Thread.sleep(2000);
        
        offerprodcut = testUtility.getPageobjectmanager().getOfferpage().getofferpageproduct();
        System.out.println(offerprodcut);
	}
	
	
	@Then("Validate name with landing page")
	public void validate_name_with_landing_page() {
		

       if (landingPageStepDefinitions.landprodcut==offerprodcut) {
    	   System.out.println("sucessful");
       }

	}

}
