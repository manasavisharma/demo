Feature: Add/Remove Elements

  Scenario Outline: Check the functionality of Add Element Button
    Given user navigates to <Page Type> page
    When user clicks hyperlink Add/Remove Elements
    When user clicks element Add Element
    Then user can view delete button
    Examples:
      | Page Type |
      | Internet  |