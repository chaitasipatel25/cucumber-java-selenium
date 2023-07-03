package com.automation.example.pages;

import com.automation.example.framework.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BingPage extends AbstractPage {

    private static final String BING_HOME_URL = "https://www.bing.com/";
    private static final By BY_SEARCH_FIELD = By.name("q");

    public BingPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHomePage() {
        getDriver().navigate().to(BING_HOME_URL);
    }

    public void enterSearchPhrase(String phrase) {
        WebElement searchField = driverWait().until(ExpectedConditions.elementToBeClickable(BY_SEARCH_FIELD));
        searchField.sendKeys(phrase);
        searchField.submit();
    }

    public boolean pageTitleContains(String phrase) {
        try {
            return driverWait().until(ExpectedConditions.titleContains(phrase));
        } catch (TimeoutException ex) {
            return false;
        }
    }
}
