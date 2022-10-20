Feature: Internet Herokuapp Testing

  Scenario Outline: Check the functionality of A/B Testing
    Given user navigates to <Page Type> page
    When user clicks hyperlink A/B Testing
    Then user can view page
    Examples:
      | Page Type   |
      | heroku_url  |

  Scenario Outline: Check the functionality of Add Element Button
    Given user navigates to <Page Type> page
    When user clicks hyperlink Add/Remove Elements
    And user clicks element Add Element
    Then user can view Delete button
    Examples:
      | Page Type  |
      | heroku_url  |


  Scenario Outline: Check the functionality of Checkboxes
    Given user navigates to <Page Type> page
    When user clicks hyperlink Checkboxes
    And user clicks on Checkbox 1 button
    Examples:
      | Page Type  |
      | heroku_url  |


  Scenario Outline: Check the functionality of Dropdown
    Given user navigates to <Page Type> page
    When user clicks hyperlink Dropdown
    And user selects option Option 2 in Dropdown
    Examples:
      | Page Type  |
      | heroku_url  |


  Scenario Outline: Check User is able to login
    Given user navigates to <Page Type> page
    When user clicks hyperlink Basic Auth
    And user enters <User Name> and <Password> in the alert
    Then user can view <Successful Message>
    Examples:
      | Page Type | User Name | Password | Successful Message |
      | heroku_url | admin     | admin    | Basic Auth         |


  Scenario Outline: Check user can view images
    Given user navigates to <Page Type> page
    When user clicks hyperlink Broken Images
    Then user can view all images on the page
    Examples:
      | Page Type  |
      | Heroku_url |


  Scenario Outline: Check functionality of image shuffling
    Given user navigates to <Page Type> page
    When user clicks hyperlink Dynamic Content
    When user clicks hyperlink click here
    Then user can view <Shuffle Images>
    Examples:
      | Page Type  |
      | heroku_url |


  Scenario Outline: Check the functionality of dynamic loading elements
    Given user navigates to <Page Type> page
    When user clicks hyperlink Dynamic Loading
    And user clicks hyperlink Example 1: Element on page that is hidden
    And user navigates to Next page
    And user clicks on Start button
    Then user can view <Loaded Message>
    Examples:
      | Page Type  |
      | heroku_url |


  Scenario Outline: Check the functionality of UI elements
    Given user navigates to <Page Type> page
    When user clicks hyperlink Dynamic Controls
    And user clicks on acheckbox button
    And user clicks on remove button
    Then user can view Add button
    Examples:
      | Page Type  |
      | heroku_url |


  Scenario Outline: Check the visibility of ads on page
    Given user navigates to <Page Type> page
    When user clicks hyperlink Entry Ad
    And user can view ads
    And user clicks on close button
    And user clicks hyperlink click here
    Then user can view ads
    Examples:
      | Page Type  |
      | heroku_url |


  Scenario Outline: Check the functionality of advertisement pop up
    Given user navigates to <Page Type> page
    When user clicks hyperlink Exit Intent
    And user move the mouse pointer outside of webpage
    Then user can view popup
    Examples:
      | Page Type  |
      | heroku_url |


  Scenario Outline: Check the functionality of downloading links
    Given user navigates to <Page Type> page
    When user clicks hyperlink File Download
    And user clicks hyperlink Screenshot 2022-09-09 112724.png
    Then user can view Downloaded file
    Examples:
      | Page Type  |
      | heroku_url |


  Scenario Outline: Check the functionality of file uploading
    Given user navigates to <Page Type> page
    When user clicks hyperlink File Upload
    And user clicks on Choose File button
    And user select the file to upload
    And user clicks on Upload button
    Examples:
      | Page Type  |
      | heroku_url |


  Scenario Outline: Check the functionality of retrieving password
    Given user navigates to <Page Type> page
    When user clicks hyperlink Forgot Password
    And user enters value <Email> in the Email input field
    And user clicks on Retrieve button
    Then user can view <Successful Message>
    Examples:
      | Page Type   | Email           |
      | heroku_url  | abc@gmail.com   |


  Scenario Outline: Check the functionality of Log In page
    Given user navigates to <Page Type> page
    When user clicks hyperlink Form Authentication
    And user enters value <User Name> in the Username input field
    And user enters value <Password> in the Password input field
    And user clicks on <Log In> button
    Then user can view <Successful Login Message>
    Examples:
      | Page Type   | User Name | Password              |
      | heroku_url  | tomsmith  | SuperSecretPassword!  |