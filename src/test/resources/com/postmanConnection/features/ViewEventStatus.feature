
@feature_view_event_status
Feature: ViewEventStatus

  Background: 
    Given the user is successfully logged into the dashboard

  @verify_completed_event
  Scenario Outline: View Event Status
    When the user navigates to the events section
    And the user locates an event that has a status of "<event_status>"
    And the user observes the event card for the completed event
    Then the event card displays "<event_display>" clearly
    And the date and time of the event are accurate and match the event details
    And the completed status is visually distinct from other statuses

    Examples:
      | event_status | event_display      |
      | completed    | Event completed    |

  @check_cancelled_event
  Scenario Outline: View Event Status
    When the user navigates to the events section
    And the user locates an event that has a status of "<event_status>"
    And the user observes the event card for the cancelled event
    Then the event card displays "<event_display>" clearly
    And the reason for cancellation is displayed if applicable
    And the cancelled status is visually distinct from other statuses

    Examples:
      | event_status | event_display     |
      | cancelled     | Event cancelled    |

  @verify_event_not_started
  Scenario Outline: View Event Status
    When the user navigates to the events section
    And the user locates an event that has a status of "not started"
    And the user observes the event card for the not started event
    Then the event card should display "Event not started yet" clearly
    And the scheduled date and time of the event should be accurate and match the event details
    And the not started status should be visually distinct from other statuses

  Examples:
    | event_status      |
    | not started       |

  @verify_event_status_update
  Scenario Outline: View Event Status
    When the user navigates to the events section
    And the user monitors an event that is currently ongoing
    And the user changes the status of the event to "<event_status>" from the admin panel
    And the user refreshes the recruiter dashboard
    Then the status of the event should update to "<expected_status>"
    And the status should be reflected accurately without delay
    And no errors should occur during the refresh process

    Examples:
      | event_status | expected_status     |
      | completed    | Event completed     |

  @event-status-visible
  Scenario Outline: View Event Status
    When the user navigates to the events section
    And the user locates an event with a status of "<event_status>"
    And the user observes the event card for the completed event
    Then the event card displays "<event_display>" clearly
    And the mobile layout is user-friendly and accessible
    And the status label is easily readable on mobile devices

    Examples:
      | event_status | event_display      |
      | completed    | Event completed    |

  @browser-testing
  Scenario Outline: View Event Status on Different Browsers
    When I navigate to the events section on "<browser>"
    And I locate an event with a status of "cancelled"
    And I observe the event card for the cancelled event
    Then the event card should display "Event cancelled" clearly on "<browser>"
    And the layout and functionality should be consistent across all browsers

    Examples:
      | browser  |
      | Chrome   |
      | Firefox  |
      | Safari   |

  @verify_recurring_event_status
  Scenario Outline: View Event Status
    When the user navigates to the events section
    Then the user should be directed to the events section without errors
    When the user locates a recurring event with multiple occurrences
    Then the recurring event should be visible in the list of events
    When the user observes the status of each occurrence
    Then each occurrence should display its respective status correctly
    And the statuses should be easily distinguishable for each occurrence
    And no confusion should arise from the recurring nature of the events

  Examples:
    | username | password |
    | user1    | pass1    |

  @check_event_status
  Scenario Outline: View Event Status
    When the user navigates to the events section
    And the user locates an event scheduled in a different time zone
    Then the event scheduled in a different time zone should be visible in the list of events
    And the event card should display its respective status correctly
    And the status should reflect the correct time zone information
    And no confusion should arise from the time zone differences

  Examples:
    | event_time_zone |
    | different_time_zone |

  @verify_event_status
  Scenario Outline: View Event Status
    When the recruiter navigates to the events section
    And the recruiter locates an event with a status displayed in a different language
    Then the event with a status displayed in a different language is visible in the list of events
    And the event card displays its respective status correctly
    And the status reflects the correct language information
    And no confusion arises from the language differences

  Examples:
    | username | password |
    | recruiter | password123 |
