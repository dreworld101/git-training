Feature: Register and Create Account

  Background:
    Given User is on the home page of "Automationpractice" website

  Scenario Outline: New user cannot create account with previously registered email address
    When User clicks the Sign in button
    And The website Authentication page is displayed
    And Enters a previously registered "<used_email>" address in the CREATE AN ACCOUNT section
    And Clicks the Create an account button
    Then An error warning is displayed informing user that email address is previously registered


    Examples:
      | used_email    |
      | test@test.com |

  Scenario Outline: Successful account creation with previously unregistered email address
    When User enters a previously unregistered "<email>" address in the CREATE AN ACCOUNT section
    And clicks the CREATE AN ACCOUNT button
    And Enters their Personal Information details "<firstName>", "<lastName>", "<password>"
    And Enter their Address details "<first_Name>", "<last_Name>" "<company>", "<address>", "<address2>", "<city>", "<postalCode>", "<homeTel>" "<mobTel>", "<addAlias>", "<add_info>", "<myaddAlias>"
    Then User account is successfully created after clicking Register button

    Examples:
      | email            | firstName | first_Name | lastName | last_Name | password    | company     | address         | address2 | city   | postalCode | homeTel     | mobTel       | addAlias    | add_info | myaddAlias  |
      | testa999zz@test.com | charles   | Charles    | Cooper   | Cooper    | password123 | ABZ Limited | 24 Apple Street | Sydenham | London | 10017      | 02384748999 | 076627889933 | 08994477489 | None     | --Dis is it |


  @mytest
    Scenario: Add item into shopping cart and remove same
      When User clicks an item to display and purchase
      And Clicks the Add to cart button in the product page
      And User cancel the displayed pop up alert
      And Clicks the Shopping Cart button to display content
      Then The added item is present in their shopping cart

  @mytest
   Scenario: Remove item from shopping cart
      When User clicks an item to display and purchase
      And Clicks the Add to cart button in the product page
      And User cancel the displayed pop up alert
      And Clicks the Shopping Cart button to display content
      And Clicks the cart content Qty minus button
      Then The deleted item is successfully removed from the shopping cart









