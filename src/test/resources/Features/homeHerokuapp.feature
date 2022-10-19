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
    Then user can view Delete button
    Examples:
      | Page Type  |
      | herokuurl  |


  Scenario Outline: Check the functionality of Checkboxes
    Given user navigates to <Page Type> page
    When user clicks hyperlink Checkboxes
    And user clicks on <Checkbox> button
    Examples:
      | Page Type  | Checkbox  |
      | herokuurl  | checkbox1 |


  Scenario Outline: Check the functionality of Dropdown
    Given user navigates to <Page Type> page
    When user clicks hyperlink Dropdown
    And user selects option Option 1 in Dropdown
    Examples:
      | Page Type  |
      | herokuurl  |


  Scenario Outline: Check User is able to login
    Given user navigates to <Page Type> page
    When user clicks hyperlink Basic Auth
    And user enters <User Name> and <Password> in the alert
    And user clicks on Sign in button
    Then user can view <Successful Message>
    Examples:
      | Page Type | User Name | Password | Successful Message |
      | herokuurl | admin     | admin    | |


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
    Then user can view <Shuffle Images>
    Examples:
      | Page Type |
      | herokuurl |

  Scenario Outline: Check the functionality of dynamic loading elements
    Given user navigates to <Page Type> page
    When user clicks hyperlink Dynamic Loading
    And user clicks hyperlink <Example>
    And user navigates to Next page
    And user clicks on <Start> button
    Then user can view <Loaded Message>
    Examples:
      | Page Type | Example  |
      | herokuurl | exmaple1 |

  Scenario Outline: Check the functionality of UIelements
    Given  user navigates to <Page Type> page
    When user clicks hyperlink Dynamic Controls
    And user clicks on <A Checkbox> button
    And user clicks on <Remove> button
    Then user can view Add button
    Examples:
      | Page Type | A Checkbox | Remove |
      | herokuurl | acheckbox  | remove |

  Scenario Outline: Check the visibility of ads on page
    Given  user navigates to <Page Type> page
    When user clicks hyperlink Entry Ad
    And user can view ads
    And user clicks on <Close> button
    And user clicks hyperlink click here
    Then user can view ads
    Examples:
      | Page Type | Close |
      | herokuurl | close |
