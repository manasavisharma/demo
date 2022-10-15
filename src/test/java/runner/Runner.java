package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"}, //the path of the feature files
        glue={"classpath:com.example.stepDefinitions"}//the path of the step definition files
)
public class Runner {
}
