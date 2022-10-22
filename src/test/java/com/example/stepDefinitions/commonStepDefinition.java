package com.example.stepDefinitions;

import com.example.helpers.GenericHelpers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

import static com.example.helpers.GenericHelpers.driver;
import static com.example.helpers.GenericHelpers.getLocatorFromDictionary;

public class commonStepDefinition {

    @When("^user clicks hyperlink (.*)$")
    public void clickHyperlink(String linkText) throws InterruptedException {
        driver.findElement(By.linkText(linkText)).click();
    }
    public static void clickByCssSelector(String s) {
        driver.findElement(By.cssSelector(s)).click();
    }
    @When("^user clicks element (.*)$")
    public void clickElement(String linkText) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[contains(text(),'" + linkText + "')]")));
        driver.findElement(By.xpath(".//*[contains(text(),'" + linkText + "')]")).click();
    }


    @And("^user move the mouse pointer outside of webpage$")
    public void adsAlertPopup() throws AWTException {
        Robot rb = new Robot();
        rb.mouseMove(600, 0);
    }

    @And("^user select the file to upload$")
    public void chooseFileFromLocalSystem(WebElement upload) {
        upload.sendKeys("C:\\Users\\ANJALI SHARMA\\Desktop\\important\\TCS.txt");
    }
}
