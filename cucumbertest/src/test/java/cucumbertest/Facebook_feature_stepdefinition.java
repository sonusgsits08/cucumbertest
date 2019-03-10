package cucumbertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When; 

public class Facebook_feature_stepdefinition { 
   WebDriver driver = null; 
	
   @Given("^I have open the browser$") 
   public void openBrowser() {
	   //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anshu\\git\\driver\\chromedriver.exe");
	   System.setProperty("webdriver.ie.driver", "C:\\Users\\Anshu\\git\\driver\\IEDriverServer.exe");
	   /*System.setProperty("webdriver.chrome.driver", "C:/Users/Anshu/git/driver/chromedriver.exe");
	   ChromeOptions options = new ChromeOptions();
	   options.addArguments("--headless");
	   options.addArguments("--no-sandbox");
	   options.addArguments("--disable-dev-shm-usage");
	   driver = new ChromeDriver(options);*/
	   driver = new InternetExplorerDriver();
   } 
	
   @When("^I open \"(.*)\" website$") 
   public void goToURL(String url) { 
      driver.navigate().to(url); 
   } 
	
   @Then("^Login button should exits$") 
   public void loginButton() { 
      if(driver.findElement(By.id("u_0_v")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail"); 
      } 
      driver.close(); 
   } 
}