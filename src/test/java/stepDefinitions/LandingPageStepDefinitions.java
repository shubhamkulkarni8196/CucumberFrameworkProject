package stepDefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingpageLocator;
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
public class LandingPageStepDefinitions {
	
	public WebDriver driver;
	public String landingPageProdcyname;
	public String offrePageProdctname;
	TestUtility testUtility;
	public String landprodcut;
	
	public LandingPageStepDefinitions(TestUtility testUtility) {
		
		this.testUtility=testUtility;
	}
	
	@Given("User landing on Greencart page")
	public void user_landing_on_greencart_page() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cucmberpro\\target\\msedgedriver.exe");
		   testUtility.driver = new EdgeDriver();
		   testUtility.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	@When("User enter {string} in search field")
	public void user_enter_in_search_field(String name) throws InterruptedException {

    ///LandingpageLocator landingpageLocator = new LandingpageLocator(testUtility.driver);
		
	testUtility.getPageobjectmanager().getlandingpage().enterSearch(name);
	
    
    Thread.sleep(2000);
    landprodcut =  testUtility.getPageobjectmanager().getlandingpage().getLandingproduct().split("-")[0].trim();
	 System.out.println(landprodcut);
	}
	



}
