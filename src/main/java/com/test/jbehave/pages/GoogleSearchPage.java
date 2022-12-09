package com.test.jbehave.pages;

import com.test.jbehave.main.Driver;
import com.test.jbehave.main.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.test.jbehave.main.Driver.driver;

public class GoogleSearchPage extends Page{

    String successResult = "#search h3";

    public String getResult() {
        return driver.findElement(By.cssSelector(successResult)).getText();
    }
}
