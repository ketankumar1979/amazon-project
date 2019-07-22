package com.amazon;

import com.amazon.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

    public static String searchproduct;
    @FindBy(css = "#twotabsearchtextbox")
    WebElement searchbox;

    @FindBy(css =".nav-search-submit.nav-sprite")
    WebElement magnifyglass;

    public void dosearch(String item){
        searchproduct = item;
        searchbox.sendKeys(item);
        magnifyglass.click();
    }
    public String gethomepageurl(){
        return driver.getCurrentUrl();
    }
}
