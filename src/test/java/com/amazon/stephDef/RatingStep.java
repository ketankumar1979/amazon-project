package com.amazon.stephDef;

import com.amazon.HomePage;
import com.amazon.ResultPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RatingStep {
    private HomePage homePage = new HomePage();
    private ResultPage resultPage = new ResultPage();

    @When("^user select a customer rating from filter$")
    public void user_select_a_customer_rating_from_filter()  {
        resultPage.selectrating("4 Stars & Up");

    }

    @Then("^user can able to see all products under selected ratings$")
    public void user_can_able_to_see_all_products_under_selected_ratings()  {

    }

}
