package utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * Utilities class, here we can find methods to help
 * the execution of the program. 
 * @author: jurodca 
 * @email: jrodriguezc@gmail.com
 * @date: 2019-11-05
 */
public abstract class Utilities{
	
	private static WebDriver driver;
	
	/**
	 * set up the driver with selenium
	 */
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Desarrollo\\Tutoriales\\Cucumber\\awstest\\src\\test\\resources\\chromedriver.exe");
		
		//By default the app don't show the window of the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);		
		Utilities.driver = new ChromeDriver(capabilities);
	}

	/**
	 * validates if the email has a correct form
	 * @param email
	 * @return
	 */
	public static boolean verifiyEmailForm(String email) {
		 Pattern pattern = Pattern
	                	   .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		 
		 Matcher mather = pattern.matcher(email);
		 
		 if (mather.find()) {
			 return  true;
		 } else {
			 return false;
		 }
	}
	
	/**
	 * compare two string and returns if they are equal or not
	 * @param password
	 * @param confirm
	 * @return
	 */
	public static boolean validatePasswords(String password, String confirm) {		
		if (password.equals(confirm)) {
			return true;
		} else {
			return false;
		}		
	}	
	
	public static WebDriver getDriver() {
		return Utilities.driver;
	}

	public static void setDriver(WebDriver driver) {
		Utilities.driver = driver;
	}
}
