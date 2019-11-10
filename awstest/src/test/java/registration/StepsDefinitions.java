package registration;

import static org.junit.Assert.assertEquals;

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
	
	public WebDriver driver;
	public String createNewUrl = Constants.CREATEFORM;
	public boolean correctEmailForm = false;
	public String expectedMessage = "Valid email!";
	public boolean passwordMatches = false;
	
	@Before
	public void setUp() {
		Utilities.setUp();		
		this.driver = Utilities.getDriver();
	}
	
	@Given("I am on the registration form")
	public void i_am_on_the_registration_form() {
	   driver.get(createNewUrl);
	}

	@When("I fill the email field with {string}")
	public void i_fill_the_email_field_with(String email) {
	   driver.findElement(By.id("ccEmail")).sendKeys(email);
	   this.correctEmailForm = Utilities.verifiyEmailForm(email);	   
	}
	
	
	@When("I fill the password field with {string} and {string}")
	public void i_fill_the_password_field(String password, String confirm) {
		driver.findElement(By.id("ccPassword")).sendKeys(password);
		driver.findElement(By.id("ccRePassword")).sendKeys(confirm);
		this.passwordMatches = Utilities.validatePasswords(password, confirm);
	}

	@Then("I get the following message {string}")
	public void i_get_the_following_message(String actualMessage) {	   
		if (correctEmailForm) {
			assertEquals(expectedMessage, actualMessage);
		} else {
			expectedMessage = "Invalid email!";
			assertEquals(expectedMessage, actualMessage);
		}
	}
	
	@Then("I get the following password message {string}")
	public void i_get_following_password_message(String message) {
		if (this.passwordMatches) {
			assertEquals("Matches", message);
		} else {
			assertEquals("Nope", message);
		} 
	}
	
	@After
	public void closeDriver() {
		driver.close();
		Utilities.getDriver().close();
	}
}
