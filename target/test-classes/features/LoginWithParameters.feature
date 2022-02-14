Feature:  login as different users

  Scenario: login as a driver user
    Given the user is on the login page
    When the user logs in using "user10" and "UserUser123"
    Then the user should be able to login
    And  the title contains "Dashboard"

   @hw #homework
  Scenario: login as a driver
    Given the user logged in as "xSALC_"
    Then the user should be able to login
    Then the title contains "Dashboard"

    #you will have one step definition and it will handle different userTypes
