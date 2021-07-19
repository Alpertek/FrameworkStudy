package com.alp.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleton {

    private Singleton(){
    }

    static WebDriver driver;
    static {
         WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


}
