@home
Feature: The user validate the myntra application

  Scenario: The user validate the home and living option
    Given The user launch the myntra application url
    When The user choose the home and living option
    And The user click the pillow option
    Then The user verify the pillow page 
    When The user select the pillow for men
    And The user choose the brand and color
    And The user the select the prodect for pillow
    Then The user verify the selecrt prodect page
    When THe user select the size for pillow
    And The user click the add to bag button in pillow page
    And The user click the bag icon for pillow prodect page
    Then The user validate the ordering  page for pillow
    When The user click the place to order button on order page
