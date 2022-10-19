package com.example.stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import static com.example.helpers.GenericHelpers.driver;

public class brokenImageClss {

    @Then("user can view all images")
    public void brokenImageLinks(String[] args) {
        throw new io.cucumber.java.PendingException();
    }

    public static void verfiyImage() throws InterruptedException {

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size());

        for( WebElement image : images) {
            String imageSrc = image.getAttribute("src");

            try {
                URL url = new URL(imageSrc);
                URLConnection urlConnection = url.openConnection();
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();

                if(httpURLConnection.getResponseCode() == 200)
                    System.out.println(imageSrc + ">>" + httpURLConnection.getResponseCode() +
                            ">>" +httpURLConnection.getResponseMessage());
                else
                    System.err.println(imageSrc + ">>" + httpURLConnection.getResponseCode() +
                            ">>" +httpURLConnection.getResponseMessage());

            } catch (IOException e) {
                System.err.println(imageSrc);
            }
        }
        driver.quit();

    }
}
