package restAPI;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome=true,
		plugin = {"pretty", "html:target/html-cucumber" },  //"json:target/cucumber.json"
		features="src/test/java/restAPI",
		tags= {"@Sanity"},
		glue= {"restAPI"} 
		
		)






public class TestRunner1 {

}
