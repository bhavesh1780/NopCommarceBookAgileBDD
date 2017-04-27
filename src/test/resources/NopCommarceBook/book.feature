Feature:
  User should able to email selected product to a friend
  So that his friend can view and purchase that product

  @book
  Scenario Outline: User should email a book to a friend

    Given User is on Homepage
    When User navigates to Books category
    And  Selects any "<book>"
    And enters all details to send email to a friend
    Then User should able to send email to a friend successfully
  Examples:
    | book                           |
    | Fahrenheit 451 by Ray Bradbury |
    | First Prize Pies               |
    | Pride and Prejudice            |