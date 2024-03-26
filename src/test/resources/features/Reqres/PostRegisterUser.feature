Feature: Register User
  Register user with json

#  Positive
#  Register-Successful
  @Tugas
  Scenario Outline: Post register user with valid json
    Given Register user with valid json "RegisterUserValid.json"
    When Send request post register user
    Then Status code should be 200
    And Response body name should be <id>
    And Validate json schema "RegisterUserValidJsonSchema.json"
    Examples:
      | id |
      | 4  |


#    Negative
#    Register-Unsuccessful
  @Tugas
  Scenario Outline: Post register user with invalid json
    Given Register user with invalid json "<JSON>"
    When Send request post register user
    Then Status code should be 400
    Examples:
      | JSON                                            |
      | RegisterUserInvalidEmail.json                   |
      | RegisterUserInvalidPassword.json                |
      | RegisterUserInvalidEmailAndInvalidPassword.json |
