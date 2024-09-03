package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F://SeleniumPrograms//featureFiles//OpenGoogle.feature", glue="stepDefinitions")
public class RunnerClass {
//combined featureclass and stepdefinitions
	//using runnner class
}
