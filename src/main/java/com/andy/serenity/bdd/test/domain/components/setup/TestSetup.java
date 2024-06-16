package com.andy.serenity.bdd.test.domain.components.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import net.thucydides.core.webdriver.WebdriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSetup implements DriverSource {

    @Override
    public WebDriver newDriver() {
        String browser = System.getProperty("webdriver.driver", "chrome").toLowerCase();

        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();

                return new FirefoxDriver();
            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();

                return new ChromeDriver();
        }
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
