package com.automation.example.stepdefs;

import com.automation.example.pages.BingPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class BingSearchSteps {

    private WebDriver driver;
    private BingPage bingPage;

    @Before(value = "@web", order = 1)
    public void initWebDriver() {
        driver = new ChromeDriver();
    }

    @Before(value = "@bing", order = 10)
    public void iniBingPage() {
        bingPage = new BingPage(driver);
    }

    @Given("^user is on the bing page$")
    public void aWebBrowserIsOnTheBingPage() {
        bingPage.navigateToHomePage();
    }

    @When("^the search phrase \"([^\"]*)\" is entered$")
    public void theSearchPhraseIsEntered(String phrase) {
        bingPage.enterSearchPhrase(phrase);
    }

    @Then("^results for \"([^\"]*)\" are shown$")
    public void resultsForAreShown(String phrase) {
        assertThat(bingPage.pageTitleContains(phrase)).isTrue();
    }

    @After(value = "@web")
    public void disposeWebDriver() {
        driver.quit();
    }
}
