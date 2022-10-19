package com.example.stepDefinitions;
import io.cucumber.java.en.And;

import static com.example.helpers.GenericHelpers.*;

public class basicAuthClss {
//    String password = "admin";
//    String username = "admin";

    @And("user enters (.*) and (.*) in the alert")
    public void enterValuesInAlert(String username, String password ) {
        String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

        throw new io.cucumber.java.PendingException();
    }
}
