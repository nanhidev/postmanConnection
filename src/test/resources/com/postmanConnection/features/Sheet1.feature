
@feature_view_job_events
Feature: Sheet1

  Background: 
    Given the recruiter is logged in and on the Job Opening Page

  @view-job-events
  Scenario Outline: View Job Events
    When the recruiter navigates to the Events section
    Then the recruiter should see a list of events for the job opening

  Examples:
    | recruiter_status | job_opening |
    | logged_in       | available    |

  @view-events
  Scenario Outline: View Events
    When the user navigates to the Events page
    Then the user should see a list of all events

  Examples:
    | event_list |
    | Event 1    |
    | Event 2    |
    | Event 3    |

  @view-event-status
  Scenario Outline: View Event Status
    When the user navigates to the Events Page
    Then the user should see the status of each event

  Examples:
    | username | password |
    | recruiter | pass123  |

  @view-report
  Scenario Outline: Search Events
    Given the user navigates to the Events page
    When the user enters the event name "<event_name>" in the search field
    And the user clicks the Search button
    Then the user should see the report of the event

    Examples:
      | event_name       |
      | Event A         |
      | Event B         |
      | Event C         |

  @view-event-report
  Scenario Outline: View Event Report
    Given the recruiter navigates to the Events section
    When the recruiter selects the specific event to view
    Then the recruiter should see the report of the selected event

  Examples:
    | event_name         |
    | <event_name>      |
