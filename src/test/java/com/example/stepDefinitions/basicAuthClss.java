package com.example.stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.example.helpers.GenericHelpers.*;

public class basicAuthClss {

    @When("user enters (.*) and (.*) in the alert")
    public void enterValuesInAlert(String username, String password) {
        String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);
        throw new io.cucumber.java.PendingException();
    }
}
