# language: en

Feature: What is the best bar for me?
  Everything wants to know the bar

  Scenario Outline:  What is the best calculated bar
    Given my number of bars is "<num>" and my budget is "<budget>"
    When i calculate my bar
    Then answer should be "<solution>"

    Examples:
      | num | budget | solution |
      | 1   | 100    | Kronbar  |