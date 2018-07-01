package Test_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue="step_definition",plugin={"html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json",
		})


public class LocalSettingsRun {

}
