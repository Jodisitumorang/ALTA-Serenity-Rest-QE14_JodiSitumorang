Feature: Create User
  Create User with json

#    Negative
  @Tugas
 Scenario Outline: Post create user with Invalid json
    Given Create user with Invalid "<JSON>"
    When Send Request Create New User
    Then Status code should be 400
    Examples:
      | JSON                       |  |
      | CreateUserInvalidName.json |  |
      | CreateUserInvalidJob.json  |  |



