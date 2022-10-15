Feature: A/B Testing

  Scenario Outline: Check the functionality of A/B Testing
    Given user navigates to <Page Type> page
    When user clicks hyperlink A/B Testing
    Then user can view page
    Examples:
      | Page Type |
      | Internet  |