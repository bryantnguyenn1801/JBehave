package com.test.jbehave.pages;

import com.test.jbehave.main.Driver;
import com.test.jbehave.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoogleHomePage extends Page{

    public void open(String url) {
        Driver.driver.get(url);
    }


}
