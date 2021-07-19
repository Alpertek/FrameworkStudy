package com.alp.tests;

import com.alp.utilities.ConfigurationReader;
import com.alp.utilities.Driver;
import com.alp.utilities.TestBase;
import com.alp.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class propertiesTest extends TestBase {

    @Test
    public static void test(){

        String browserType = ConfigurationReader.get("browsers");
        String url = ConfigurationReader.get("url");
        System.out.println("browserType = " + browserType);
        System.out.println("url = " + url);
        // WebDriver driver = WebDriverFactory.getDriver(browserType);
    }
    @Test
    public void openBrowserWithConfiguration(){
        String browserType = ConfigurationReader.get("browser");
        String url = ConfigurationReader.get("url");

        driver.get(url);

    }
}
