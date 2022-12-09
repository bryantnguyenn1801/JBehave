package com.test.jbehave.main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.test.jbehave.main.Driver.driver;


public class Page /*extends WebDriverPage*/ {

    public Page() {
//        PageFactory.initElements(Driver.driver, this);
    }

    protected boolean isElementPresent(By locator) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        List<WebElement> elements = driver.findElements(locator);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return elements.size() > 0 && elements.get(0).isDisplayed();
    }

    protected void type(WebElement webElement, String text){
        webElement.clear();
        webElement.sendKeys(text);
    }

    protected void type(String webElement, String text){
        WebElement element = driver.findElement(By.xpath(webElement));
        type(element, text);
    }

    protected void selectElementByTheText(String locator, String text){
        Select select = new Select(driver.findElement(By.xpath(locator)));
        select.selectByVisibleText(text);
        select.getFirstSelectedOption();
    }


    protected void javaScriptCodeExecutor(String javaScriptCode){
        ((JavascriptExecutor) driver).executeScript(javaScriptCode);
    }


//    protected void waitExplicitlyWebElement(WebElement locator, int seconds){
//        WebDriverWait waiter = new WebDriverWait(Driver.driver, seconds);
//        waiter.until(ExpectedConditions.visibilityOf(locator));
//    }

}
