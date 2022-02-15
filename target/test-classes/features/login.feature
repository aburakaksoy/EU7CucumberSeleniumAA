@login @smoke
Feature: User should be able to login

  Background:
    Given the user is on the login page

  @driver @login
  Scenario: Login as a driver
    When the user enters the driver information
    Then the user should be able to login

   @login @smoke
  Scenario: Login as a sales manager
    When the user enters the sales menager information
    Then the user should be able to login

    @store_manager @smoke
    Scenario: Login as a store manager
      When the user enters the store manager information
      Then the user should be able to login