package registration;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 * Main class for registration.feature 
 * @author: jurodca 
 * @email: jrodriguezc@gmail.com
 * @date: 2019-11-07
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},features="classpath:awstest/registration/registration.feature" )
public class RunCucumberRegistration {

}
