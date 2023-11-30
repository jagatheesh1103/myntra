@search
Feature: The user validate the myntra application

  Scenario Outline: The user validate the search option for myntra apllication
    Given The user launch the myntra application url
    When To the enter prodect name in search box "<prodect>"
    Then The user validate the search prodect is appear in the page
    When The user select the categories for shoes
    And The user select the brand and colur
    And The user click the prodect for he want
    Then The user verify the prodect page for shoes
    When The user choose the size for the shoe
    And The user click the add to bag button and bag icon for shoe
    Then The user validate the ordering page for shoe
    When The click click the place to order button
    
    Examples:
    |prodect|
    |mens shoes|

