package com.postmanConnection.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class Sheet1Page {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public Sheet1Page(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "jobOpeningPageLink")
    private WebElement jobOpeningPageLink;

    @FindBy(id = "eventsSectionLink")
    private WebElement eventsSectionLink;

    @FindBy(id = "eventList")
    private WebElement eventList;

    @FindBy(id = "eventsPageLink")
    private WebElement eventsPageLink;

    @FindBy(id = "eventStatus")
    private WebElement eventStatus;

    @FindBy(id = "searchField")
    private WebElement searchField;

    @FindBy(id = "searchButton")
    private WebElement searchButton;

    @FindBy(id = "eventReport")
    private WebElement eventReport;

    @FindBy(id = "selectedEventReport")
    private WebElement selectedEventReport;

    public void navigateToJobOpeningPage() {
        try {
            elementUtils.clickElement(jobOpeningPageLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToEventsSection() {
        try {
            elementUtils.clickElement(eventsSectionLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isEventListDisplayed() {
        try {
            return elementUtils.isElementDisplayed(eventList);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void navigateToEventsPage() {
        try {
            elementUtils.clickElement(eventsPageLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isAllEventsListDisplayed() {
        try {
            return elementUtils.isElementDisplayed(eventList);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEventStatusDisplayed() {
        try {
            return elementUtils.isElementDisplayed(eventStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterEventNameInSearchField(String eventName) {
        try {
            elementUtils.clearAndSendKeys(searchField, eventName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSearchButton() {
        try {
            elementUtils.clickElement(searchButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isEventReportDisplayed() {
        try {
            return elementUtils.isElementDisplayed(eventReport);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectSpecificEvent() {
        try {
            // Logic to find and select a specific event (not provided in the step definitions).
            // This should be implemented based on the application's specific requirements.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSelectedEventReportDisplayed() {
        try {
            return elementUtils.isElementDisplayed(selectedEventReport);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}