package com.alp.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;
    protected JavascriptExecutor executor;


    @BeforeMethod
    public void setUp(){
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);
    }
    @AfterClass
    public void tearDown(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.closeDriver();
    }
}
