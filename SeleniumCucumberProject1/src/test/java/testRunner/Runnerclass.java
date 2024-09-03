package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F://SeleniumPrograms//SeleniumCucumberProject1//Features//hooks.feature",
	    glue={"stepDefinitions" ,"hooks"},
	    dryRun=false,
	    monochrome=true,
	    plugin= {"html:report/WebReport", "json:report/jsonreport.json","junit:report/xmlreport.xml"}
	  // tags= {"@hooks"}
		)
public class Runnerclass {

}
