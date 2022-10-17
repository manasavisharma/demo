Feature: Internet Herokuapp Testing

  Scenario Outline: Check the functionality of A/B Testing
    Given user navigates to <Page Type> page
    When user clicks hyperlink A/B Testing
    Then user can view page
    Examples:
      | Page Type  |
      | herokuurl  |

  Scenario Outline: Check the functionality of Add Element Button
    Given user navigates to <Page Type> page
    When user clicks hyperlink Add/Remove Elements
    And user clicks element Add Element
    Then user can view Delete
    Examples:
      | Page Type  |
      | herokuurl  |


  Scenario Outline: Check the functionality of Checkboxes
    Given user navigates to <Page Type> page
    When user clicks hyperlink Checkboxes
    When user selects option <Checkbox1>
    Examples:
      | Page Type  | Checkbox1 |
      | herokuurl  |           |


  Scenario Outline: Check the functionality of Dropdown
    Given user navigates to <Page Type> page
    When user clicks hyperlink Dropdown
    When user selects option <Option> in dropdown
    Examples:
      | Page Type  | Option   |
      | herokuurl  | 1 |


  Scenario Outline: Check User is able to login
    Given user navigates to <Page Type> page
    When user clicks hyperlink Basic Auth
    And user enters <User Name> and <Password> in the alert
    And user clicks on Sign in button
    Then user can view the <Successful Message>
    Examples:
      | Page Type | User Name | Password | Successful Message |
      | herokuurl | admin    | admin    | |


  Scenario Outline: Check user can view images
    Given user navigates to <Page Type> page
    When user clicks hyperlink Broken Images
    Then user can view all images
    Examples:
      | Page Type |
      | Herokuurl |


  Scenario Outline: Check functionality of image shuffling
    Given user navigates to <Page Type> page
    When user clicks hyperlink Dynamic Content
    When user clicks hyperlink click here
    Then user can view the shuffle images
    Examples:
      | Page Type |
      | herokuapp |