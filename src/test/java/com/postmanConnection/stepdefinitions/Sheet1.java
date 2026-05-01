package com.postmanConnection.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.postmanConnection.pages.Sheet1Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Sheet1 extends DriverFactory {
Sheet1Page sheet1Page = new Sheet1Page(driver);
@Given("the recruiter is logged in and on the Job Opening Page")
public void the_recruiter_is_logged_in_and_on_the_job_opening_page() {
sheet1Page.navigateToJobOpeningPage();
}
@When("the recruiter navigates to the Events section")
public void the_recruiter_navigates_to_the_events_section() {
sheet1Page.navigateToEventsSection();
}
@Then("the recruiter should see a list of events for the job opening")
public void the_recruiter_should_see_a_list_of_events_for_the_job_opening() {
sheet1Page.isEventListDisplayed();
}
@When("the user navigates to the Events page")
public void the_user_navigates_to_the_events_page() {
sheet1Page.navigateToEventsPage();
}
@Then("the user should see a list of all events")
public void the_user_should_see_a_list_of_all_events() {
sheet1Page.isAllEventsListDisplayed();
}
@Then("the user should see the status of each event")
public void the_user_should_see_the_status_of_each_event() {
sheet1Page.isEventStatusDisplayed();
}
@Given("the user navigates to the Events page")
public void the_user_navigates_to_the_events_page_for_search() {
sheet1Page.navigateToEventsPage();
}
@When("the user enters the event name {string} in the search field")
public void the_user_enters_the_event_name_in_the_search_field(String eventName) {
sheet1Page.enterEventNameInSearchField(eventName);
}
@And("the user clicks the Search button")
public void the_user_clicks_the_search_button() {
sheet1Page.clickSearchButton();
}
@Then("the user should see the report of the event")
public void the_user_should_see_the_report_of_the_event() {
sheet1Page.isEventReportDisplayed();
}
@Given("the recruiter navigates to the Events section")
public void the_recruiter_navigates_to_the_events_section_for_report() {
sheet1Page.navigateToEventsSection();
}
@When("the recruiter selects the specific event to view")
public void the_recruiter_selects_the_specific_event_to_view() {
sheet1Page.selectSpecificEvent();
}
@Then("the recruiter should see the report of the selected event")
public void the_recruiter_should_see_the_report_of_the_selected_event() {
sheet1Page.isSelectedEventReportDisplayed();
}