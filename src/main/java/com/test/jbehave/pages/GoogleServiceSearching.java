package com.test.jbehave.pages;

import com.test.jbehave.main.Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Scanner;

public class GoogleServiceSearching extends Page {

    String keywordElement = "//input[@name='q']";

    public void enterKeyword(String keyWord) {
        type(keywordElement, keyWord + "\n");
    }
}
