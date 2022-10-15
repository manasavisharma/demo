Feature: CheckBoxes

  Scenario Outline: Check the functionality of Checkboxes
    Given user navigates to <Page Type> page
    When user clicks hyperlink Checkboxes
    When user selects option <Checkbox1>
    Examples:
      | Page Type | Checkbox1 |
      | Internet  |           |
