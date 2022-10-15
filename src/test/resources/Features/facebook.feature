Feature: Facebook Login

  Scenario Outline: Check user is able to login
    Given user navigates to <Page Type> page
    When user enters value <Username> in the username input field
    And user enters value <Password> in the password input field
    And user clicks on Login button
    Then user can view the <Successful Message>
    Examples:
      | Page Type | Username | Password | Successful Message |
      | Internet  | Manasavi | Manasavi |   |