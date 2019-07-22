package com.amazon.stephDef;

import com.amazon.ResultPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.regex.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;

public class DepartmentStep {
    ResultPage resultPage = new ResultPage();

    @When("^user select a department from filter$")
    public void user_select_a_department_from_filter()  {
    resultPage.selectAdepartment("Men's Tracksuits");
    }

    @Then("^user can see all products reletive to selcted department$")
    public void user_can_see_all_products_reletive_to_selcted_department(){
     WebElement actual = resultPage.headerOfDepartmentPage();
     actual.isSelected();

    }

}
