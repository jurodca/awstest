package awstest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Constants;
import utilities.Utilities;


public class StepsDefinitions {	

	private WebDriver driver;
	private final String webUrl = Constants.WEBURL;
	private final String registrationUrl = Constants.REGISTRATION;
	
	@Before
	public void setUp() {		
		Utilities.setUp();		
		this.driver = Utilities.getDriver();
	}
	
	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
	    driver.get(webUrl);
	}

	@When("The user fills in account id with {string}")
	public void the_user_fills_in_with(String username) {		
		driver.findElement(By.id("resolving_input")).sendKeys(username);		
	}

	@When("The user press next button")
	public void the_user_press_next_button() {
		driver.findElement(By.id("next_button")).click();
	}

	@Then("The users should be on the user home page")
	public void the_users_should_be_on_the_user_home_page() {
	   
		String actualUrl = driver.getCurrentUrl();
		
		if (actualUrl.equalsIgnoreCase(this.registrationUrl)) {
			System.out.println("Redirecting to registration page, the user doesn´t exits.");
		} else {
			System.out.println("In the verification page");
		}		
	}

	@Then("The users sees {string}")
	public void the_users_sees(String message) {
	   System.out.println(message);
	}
	
	@After
	public void closeDriver() {
		driver.close();
		Utilities.getDriver().close();
	}	
}
