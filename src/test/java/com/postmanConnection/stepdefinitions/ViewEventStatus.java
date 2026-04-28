package com.postmanConnection.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.postmanConnection.pages.ViewEventStatusPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ViewEventStatus extends DriverFactory {
ViewEventStatusPage viewEventStatusPage = new ViewEventStatusPage(driver);
@Given("the user is successfully logged into the dashboard")
public void the_user_is_successfully_logged_into_the_dashboard() {
viewEventStatusPage.loginToDashboard();
}
@When("the user navigates to the events section")
public void the_user_navigates_to_the_events_section() {
viewEventStatusPage.navigateToEventsSection();
}
@When("the user locates an event that has a status of {string}")
public void the_user_locates_an_event_that_has_a_status_of(String eventStatus) {
viewEventStatusPage.locateEventByStatus(eventStatus);
}
@When("the user observes the event card for the completed event")
public void the_user_observes_the_event_card_for_the_completed_event() {
viewEventStatusPage.observeEventCard();
}
@Then("the event card displays {string} clearly")
public void the_event_card_displays_clearly(String eventDisplay) {
Assert.assertEquals(eventDisplay, viewEventStatusPage.getEventCardDisplay());
}
@Then("the date and time of the event are accurate and match the event details")
public void the_date_and_time_of_the_event_are_accurate_and_match_the_event_details() {
viewEventStatusPage.isEventDateTimeAccurate();
}
@Then("the completed status is visually distinct from other statuses")
public void the_completed_status_is_visually_distinct_from_other_statuses() {
viewEventStatusPage.isCompletedStatusDistinct();
}
@Then("the reason for cancellation is displayed if applicable")
public void the_reason_for_cancellation_is_displayed_if_applicable() {
viewEventStatusPage.isCancellationReasonDisplayed();
}
@Then("the event card should display {string} clearly")
public void the_event_card_should_display_clearly(String eventNotStartedDisplay) {
Assert.assertEquals(eventNotStartedDisplay, viewEventStatusPage.getEventNotStartedDisplay());
}
@Then("the scheduled date and time of the event should be accurate and match the event details")
public void the_scheduled_date_and_time_of_the_event_should_be_accurate_and_match_the_event_details() {
viewEventStatusPage.isScheduledDateTimeAccurate();
}
@Then("the not started status should be visually distinct from other statuses")
public void the_not_started_status_should_be_visually_distinct_from_other_statuses() {
viewEventStatusPage.isNotStartedStatusDistinct();
}
@When("the user monitors an event that is currently ongoing")
public void the_user_monitors_an_event_that_is_currently_ongoing() {
viewEventStatusPage.monitorOngoingEvent();
}
@When("the user changes the status of the event to {string} from the admin panel")
public void the_user_changes_the_status_of_the_event_to_from_the_admin_panel(String eventStatus) {
viewEventStatusPage.changeEventStatus(eventStatus);
}
@When("the user refreshes the recruiter dashboard")
public void the_user_refreshes_the_recruiter_dashboard() {
viewEventStatusPage.refreshDashboard();
}
@Then("the status of the event should update to {string}")
public void the_status_of_the_event_should_update_to(String expectedStatus) {
Assert.assertEquals(expectedStatus, viewEventStatusPage.getUpdatedEventStatus());
}
@Then("the status should be reflected accurately without delay")
public void the_status_should_be_reflected_accurately_without_delay() {
viewEventStatusPage.isStatusUpdatedWithoutDelay();
}
@Then("no errors should occur during the refresh process")
public void no_errors_should_occur_during_the_refresh_process() {
viewEventStatusPage.hasRefreshErrors();
}
@When("I navigate to the events section on {string}")
public void i_navigate_to_the_events_section_on(String browser) {
viewEventStatusPage.navigateToEventsSectionOnBrowser(browser);
}
@Then("the event card should display {string} clearly on {string}")
public void the_event_card_should_display_clearly_on(String eventDisplay, String browser) {
Assert.assertEquals(eventDisplay, viewEventStatusPage.getEventCardDisplayOnBrowser(browser));
}
@Then("the layout and functionality should be consistent across all browsers")
public void the_layout_and_functionality_should_be_consistent_across_all_browsers() {
viewEventStatusPage.isLayoutConsistentAcrossBrowsers();
}
@Then("the user should be directed to the events section without errors")
public void the_user_should_be_directed_to_the_events_section_without_errors() {
viewEventStatusPage.isNavigatedToEventsSection();
}
@When("the user locates a recurring event with multiple occurrences")
public void the_user_locates_a_recurring_event_with_multiple_occurrences() {
viewEventStatusPage.locateRecurringEvent();
}
@Then("the recurring event should be visible in the list of events")
public void the_recurring_event_should_be_visible_in_the_list_of_events() {
viewEventStatusPage.isRecurringEventVisible();
}
@When("the user observes the status of each occurrence")
public void the_user_observes_the_status_of_each_occurrence() {
viewEventStatusPage.observeStatusOfEachOccurrence();
}
@Then("each occurrence should display its respective status correctly")
public void each_occurrence_should_display_its_respective_status_correctly() {
viewEventStatusPage.areStatusesDisplayedCorrectly();
}
@Then("the statuses should be easily distinguishable for each occurrence")
public void the_statuses_should_be_easily_distinguishable_for_each_occurrence() {
viewEventStatusPage.areStatusesDistinguishable();
}
@Then("no confusion should arise from the recurring nature of the events")
public void no_confusion_should_arise_from_the_recurring_nature_of_the_events() {
viewEventStatusPage.isConfusionArisingFromRecurringEvents();
}
@When("the user locates an event scheduled in a different time zone")
public void the_user_locates_an_event_scheduled_in_a_different_time_zone() {
viewEventStatusPage.locateEventInDifferentTimeZone();
}
@Then("the event scheduled in a different time zone should be visible in the list of events")
public void the_event_scheduled_in_a_different_time_zone_should_be_visible_in_the_list_of_events() {
viewEventStatusPage.isEventInDifferentTimeZoneVisible();
}
@Then("the event card should display its respective status correctly")
public void the_event_card_should_display_its_respective_status_correctly() {
viewEventStatusPage.isEventCardStatusCorrect();
}
@Then("the status should reflect the correct time zone information")
public void the_status_should_reflect_the_correct_time_zone_information() {
viewEventStatusPage.isTimeZoneInformationCorrect();
}
@Then("no confusion should arise from the time zone differences")
public void no_confusion_should_arise_from_the_time_zone_differences() {
viewEventStatusPage.isConfusionFromTimeZoneDifferences();
}
@When("the recruiter locates an event with a status displayed in a different language")
public void the_recruiter_locates_an_event_with_a_status_displayed_in_a_different_language() {
viewEventStatusPage.locateEventWithDifferentLanguageStatus();
}
@Then("the event with a status displayed in a different language is visible in the list of events")
public void the_event_with_a_status_displayed_in_a_different_language_is_visible_in_the_list_of_events() {
viewEventStatusPage.isEventWithDifferentLanguageVisible();
}
@Then("the event card displays its respective status correctly")
public void the_event_card_displays_its_respective_status_correctly() {
viewEventStatusPage.isEventCardStatusCorrectInDifferentLanguage();
}
@Then("the status reflects the correct language information")
public void the_status_reflects_the_correct_language_information() {
viewEventStatusPage.isLanguageInformationCorrect();
}
@Then("no confusion arises from the language differences")
public void no_confusion_arises_from_the_language_differences() {
viewEventStatusPage.isConfusionFromLanguageDifferences();
}

@Given("the recruiter navigates to the events section")
public void the_recruiter_navigates_to_the_events_section() {
viewEventStatusPage.navigateToEventsSection();
}
@When("I observe the event card for the cancelled event")
public void i_observe_the_event_card_for_the_cancelled_event() {
viewEventStatusPage.observeEventCardForCancelledEvent();
}
@When("the user observes the event card for the not started event")
public void the_user_observes_the_event_card_for_the_not_started_event() {
viewEventStatusPage.observeEventCardForNotStartedEvent();
}
@Then("the event card should display event cancelled clearly on {string}")
public void the_event_card_should_display_event_cancelled_clearly_on(String platform) {
viewEventStatusPage.isEventCancelledDisplayedClearly(platform);
}
@Then("the event card should display event not started yet clearly")
public void the_event_card_should_display_event_not_started_yet_clearly() {
viewEventStatusPage.isEventNotStartedDisplayedClearly();
}
@When("the user locates an event that has a status of not started")
public void the_user_locates_an_event_that_has_a_status_of_not_started() {
viewEventStatusPage.locateEventWithStatusNotStarted();
}
@When("I locate an event with a status of cancelled")
public void i_locate_an_event_with_a_status_of_cancelled() {
viewEventStatusPage.locateEventWithStatusCancelled();
}
@When("the user locates an event with a status of {string}")
public void the_user_locates_an_event_with_a_status_of(String status) {
viewEventStatusPage.locateEventWithStatus(status);
}
@Then("the cancelled status is visually distinct from other statuses")
public void the_cancelled_status_is_visually_distinct_from_other_statuses() {
viewEventStatusPage.isCancelledStatusVisuallyDistinct();
}
@Then("the status label is easily readable on mobile devices")
public void the_status_label_is_easily_readable_on_mobile_devices() {
viewEventStatusPage.isStatusLabelReadableOnMobile();
}
@Then("the mobile layout is user-friendly accessible")
public void the_mobile_layout_is_user_friendly_accessible() {
viewEventStatusPage.isMobileLayoutUserFriendly();
}
}