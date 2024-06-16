package com.andy.serenity.bdd.test.domain.components.ui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BasePage extends PageObject {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    // Common method to open a URL
    public void navigateTo(String url) {
        getDriver().get(url);
    }

    // Common method to click on an element
    public void clickOn(By locator, Duration timeout) {
        find(locator).withTimeoutOf(timeout).click();
    }

    // Common method to find an element by its locator
    public WebElementFacade find(By locator, Duration timeout) {
        return element(locator).withTimeoutOf(timeout);
    }

    // Custom wait for an element to be visible with a specific timeout
    public void waitForElementToBeVisible(By locator, Duration timeout) {
        find(locator).withTimeoutOf(timeout).waitUntilVisible();
    }

    // Common method to check if an element is displayed
    public boolean isElementDisplayed(By locator, Duration timeout) {
        return find(locator).withTimeoutOf(timeout).isDisplayed();
    }

    // Common method to type text into an element
    public void typeInto(By locator, String text, Duration timeout) {
        find(locator).withTimeoutOf(timeout).type(text);
    }

    // Common method to get text from an element
    public String getTextFromElement(By locator, Duration timeout) {
        return find(locator).withTimeoutOf(timeout).getText();
    }

}
