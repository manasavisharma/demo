Feature: Dropdown

  Scenario Outline: Check the functionality of Dropdown
    Given user navigates to <Page Type> page
    When user clicks hyperlink Dropdown
    When user selects option <Dropdown> in <Option>
    Examples:
      | Page Type | Option   |
      | Internet  | Option 1 |
