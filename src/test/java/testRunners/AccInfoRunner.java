package testRunners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"./src/test/resources/features/Registration.feature"},
                glue= {"stepDefinations","hooks"},  
                plugin= {"pretty"},
                publish= true,
                dryRun= false
                
                              )



public class AccInfoRunner {

}
