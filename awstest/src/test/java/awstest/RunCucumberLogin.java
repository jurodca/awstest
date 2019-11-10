package awstest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/*
 * Main class for login.feature 
 * @author: jurodca 
 * @email: jrodriguezc@gmail.com
 * @date: 2019-11-05
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features="classpath:awstest/login/login.feature")
public class RunCucumberLogin {
}
