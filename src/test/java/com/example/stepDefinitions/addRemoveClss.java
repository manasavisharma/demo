package com.example.stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.example.helpers.GenericHelpers.*;

public class addRemoveClss {

    @Then("^user can view (.*) button$")
    public void deleteButton(String button) {
      String[] locator= getLocatorFromDictionary(button);
        driver.findElement(By.cssSelector(locator[1])).isDisplayed();
        // Write code here that turns the phrase above into concrete actions
    }
}
