Feature: Update user
  Update user with json

#  Negative
  @Tugas
  Scenario Outline: Put update user with Invalid json
    Given Update user with invalid json "<json>" and user id <id>
    When Send request update user
    Then Status code should be 400
    Examples:
      | json                                    | id |
      | UpdateUserInvalidName.json              | 1  |
      | UpdateUserInvalidJob.json               | 2  |
      | UpdateUserInvalidNameAndInvalidJob.json | 3  |