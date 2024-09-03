 package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features="F://SeleniumPrograms//SeleniumCucumberProject1//Features//OrangeHRM.feature",
		//features= "/SeleniumCucumberProject1/Features/OrangeHRM.feature",
		//features="Features/OrangeHRMsteps",
		glue="stepDefinitions"
		)
public class TestRunner {
	

}
 