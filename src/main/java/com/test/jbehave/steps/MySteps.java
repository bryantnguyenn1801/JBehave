package com.test.jbehave.steps;

import com.test.jbehave.main.Base;
import com.test.jbehave.pages.GoogleHomePage;
import com.test.jbehave.pages.GoogleSearchPage;
import com.test.jbehave.pages.GoogleServiceSearching;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.testng.Assert;

import java.util.Map;
import java.util.Scanner;

public class MySteps extends Base {

    private GoogleHomePage googleHomePage;
    private GoogleServiceSearching googleServiceSearching = new GoogleServiceSearching();
    private GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    private Map<String, String> message;
    Scanner keyboard = new Scanner(System.in);


    @Given("I open the browser and proceed to google page $url")
    public void givenGoogleBasePage(String url) {
        googleHomePage = new GoogleHomePage();
        googleHomePage.open(url);
    }
//    @When("Google is displayed")
//    public void transferringToGoogleSearchPage(){
//        googleSearchPage = new GoogleSearchPage();
//    }
    @When("I input keyword $keyword in field and click enter")
    public void whenEnteredKeyword(String keyword) {
        googleServiceSearching.enterKeyword(keyword);
    }
    @Then("Google responses the results, and I wanna verify $text that the search correct or not")
    public void keywordAppeared(String text){
//        Assert.assertEquals(text,googleSearchPage.getResult());
        Assert.assertTrue((googleSearchPage.getResult()).contains(text));
    }


//    @Given("gmail authentication form")
//    public void givenGoogleAuthenticationForm() {
//        googleServiceSearching = googleHomePage.clickLoginButton();
//    }
//
//    @When("the user has entered wrong $username and $password")
//    public void whenEnteredWrongAccount(String username, String password) {
//        googleServiceSearching.enterUserName(username);
//        googleServiceSearching.enterPassword(password);
//    }
//
//    @When("log-in button has been pressed")
//    public void whenPressedLoginButton() {
//        googleServiceSearching.pressEnterButton();
//    }
//
//    @Then("the user should see corresponding error message: $examplesTable")
//    public void thenExpectingErrorMessage(ExamplesTable examplesTable) {
//        message = examplesTable.getRow(0);
//        Assert.assertTrue(googleServiceSearching.isLoginErrorMessage(message.get("message")));
//    }
//

//
//    @Then("new message on the top of screen should appeared: $examplesTable")
//    public void messageAppeared(ExamplesTable examplesTable){
//        message = examplesTable.getRow(0);
//        Assert.assertEquals(message.get("message"),googleSearchPage.getMessage());
//    }



}