@2TEST
Feature: Buy laptop in advantageonlineShopping if avaliable

  @TESTFINE
  Scenario: The User login in the WEB and Buy laptop avaliable
    Given the user logs in the page username osivlari,Pepito123456
    When you select laptops and select the available laptop
    Then add to the shopping cart
    And Verify the laptop Name


  @TESTFAILED
  Scenario: The user search a laptop lenovo but he doesn´t find it
    Given the user logs in the page username osivlari,Pepito123456
    When he search a lenovo laptop
    Then He validates No results for "lenovo"
