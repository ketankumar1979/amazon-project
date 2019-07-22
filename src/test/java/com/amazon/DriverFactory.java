package com.amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
    public void openBrowser(){
       //WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
       // driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");
    }
    public void maxiBrowser(){
        driver.manage().window().maximize();
    }
    public void implicitewait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
        driver.quit();
    }
}
