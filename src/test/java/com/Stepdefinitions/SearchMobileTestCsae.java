package com.Stepdefinitions;

import com.pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.alokshetty.BaseClass.Library;

import java.io.IOException;

public class SearchMobileTestCsae extends Library {
    SearchPage searchPage;
    @Given("Launch the Flipkart Application")
    public void launch_the_flipkart_application() throws IOException {
        launchApplication();
    }
    @When("Close the popup")
    public void close_the_popup() {
        System.out.println(driver.getTitle());

    }
    @Then("It should Navigate to the Home Page")
    public void it_should_navigate_to_the_home_page() {
         searchPage =new SearchPage(driver);
         searchPage.Search("Mobile");
         searchPage.clickSearch();

    }
    @Given("User Enter the text in search field")
    public void user_enter_the_text_in_search_field() {
            searchPage.Search("mobile");
    }
    @When("Click the Search button")
    public void click_the_search_button() {
        searchPage.clickSearch();

    }
    @Then("It should Navigate To the search result Page and display the relevent details")
    public void it_should_navigate_to_the_search_result_page_and_display_the_relevent_details() {
        searchPage.Result();
    }
}
