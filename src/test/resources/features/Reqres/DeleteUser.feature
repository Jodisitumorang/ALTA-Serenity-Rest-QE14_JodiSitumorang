Feature: Delete user
  Delete user with id user

#  Negative
  Scenario: Delete user with invalid user id
    Given Delete user with invalid id -1
    When Send request delete user
    Then Status code should be 400
