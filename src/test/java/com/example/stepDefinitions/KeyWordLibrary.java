package com.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import static com.example.helpers.GenericHelpers.*;
import static com.example.stepDefinitions.commonStepDefinition.clickByCssSelector;

public class KeyWordLibrary {
    @Given("^user navigates to (.*) page$")
    public static  void open(String url) throws InterruptedException {
        String[] locator=getLocatorFromDictionary(url);
        driver.navigate().to(locator[1]);
    }

    @When("^enter \"([^\"]*)\",\"([^\"]*)\"$")
    public void enter(String xpath_selector, String set_value) {
        driver.findElement(By.xpath(xpath_selector)).sendKeys(set_value);
    }

    @When("^click \"([^\"]*)\"$")
    public static void click(String xpath_selector) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_selector)));
        WebElement element = driver.findElement(By.xpath((xpath_selector)));
        element.click();
    }

    @When("^doubleclick \"([^\"]*)\"$")
    public void doubleClick(String xpath_selector) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_selector)));
        WebElement element = driver.findElement(By.xpath((xpath_selector)));
        Actions act = new Actions(driver);
        act.doubleClick(element).perform();
    }

    @When("^user clicks link (.*)$")
    public void clickLink(String cssSelector) throws InterruptedException {
        driver.findElement(By.cssSelector("#" + cssSelector)).click();
    }



    @When("^user double clicks element (.*)$")
    public void doubleClickTab(String linkText) throws InterruptedException {
        doubleClick(".//*[contains(text(),'" + linkText + "')]");
    }

    // sets value of an input field
    @And("^user enters value (.*) in the (.*) input field$")
    public void setInputElement(String value, String inputField) {
        String identifier1 = inputField.replaceAll("\\s", "").toLowerCase();
        String[] selector = getLocatorFromDictionary(identifier1);
        WebElement inputElement=findWebTextBox(driver.findElement(By.xpath("/*")),selector[1]);
        inputElement.sendKeys(value);
    }

    @And("^user clicks on (.*) button$")
    public void clickButton(String button) throws InterruptedException {
        String[] buttonElement = getLocatorFromDictionary(button.trim());
        clickByCssSelector(buttonElement[1]);
    }

    @And("^user selects option (.*) in (.*)$")
    public void selectOption(String text, String locator) throws InterruptedException {
        String[] selectSelector = getLocatorFromDictionary(locator);
        Select selectBox = findSelectBox(driver.findElement(By.xpath("/*")),selectSelector);
//        selectBox.selectByVisibleText(text);
        Thread.sleep(2000);
        selectBox.selectByValue(text);
    }

    @Then("^user can view (.*)$")
    public void isDisplayed(String buttonElement) throws InterruptedException {
        Thread.sleep(5000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.invisibilityOf(By.cssSelector()));
        driver.findElement(By.xpath(".//*[contains(text(), '" + buttonElement + "')]")).isDisplayed();
    }



}
