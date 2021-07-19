package com.alp.tests;

import com.alp.utilities.ConfigurationReader;
import com.alp.utilities.TestBase;
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
