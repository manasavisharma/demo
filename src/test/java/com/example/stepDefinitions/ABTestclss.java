package com.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.example.stepDefinitions.KeyWordLibrary;
import static com.example.helpers.GenericHelpers.*;

public class ABTestclss {

    @Then("^user can view (.*) button$")
    public void deleteButton(String button) {
      String[] locator= getLocatorFromDictionary(button);
        driver.findElement(By.cssSelector(locator[1])).isDisplayed();
        // Write code here that turns the phrase above into concrete actions
    }
}
