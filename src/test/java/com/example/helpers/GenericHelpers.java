package com.example.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static com.example.helpers.ObjectRepo.*;

public class GenericHelpers {


  public static WebDriver driver;
  public static WebElement element(String locatorType,String locator){
      switch (locatorType){
          case "xPath":
          return  driver.findElement(By.xpath(locator));

          case "cssSelector":
           return driver.findElement(By.cssSelector(locator));
      }

      return null;
  }
    public static String[] getLocatorFromDictionary(String identifier) {
        identifier = identifier.replaceAll("\\s", "").toLowerCase();
        String[] selector = getSelector(identifier).split(",");
        return selector;
    }

    public static Select findSelectBox(WebElement element, String[] selectSelector) {
        return (Select) element.findElement(By.cssSelector(selectSelector[1]));
    }

    static {
        System.setProperty("webdriver.chrome.driver", "src/lib/chromedriver.exe");
        driver= new ChromeDriver();
    }

    public static WebElement findWebTextBox(WebElement element,String elementSelector) {
        return element.findElement(By.cssSelector(elementSelector));
    }

}
