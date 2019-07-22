package com.amazon;

import com.amazon.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends DriverFactory{

    @FindBy(css = ".a-spacing-micro.s-navigation-indent-1")
   List<WebElement>  departments;

    @FindBy(xpath = "//*[@id=\"reviewsRefinements\"]/ul")
   WebElement  ratings;


   // @FindBy(xpathSelector(".a-color-state.a-text-bold")).getText();
    //}
    public void selectAdepartment(String selcteddepartment){
           for (WebElement department : departments){
               if (department.getText().equalsIgnoreCase(selcteddepartment)){
                   department.click();
                   break;
               }
           }
    }
    public WebElement headerOfDepartmentPage(){
           return driver.findElement(By.cssSelector(".nav-search-label"));

    }
    public void selectrating(String selected){


                ratings.getText().equalsIgnoreCase(selected);

            }
        }

