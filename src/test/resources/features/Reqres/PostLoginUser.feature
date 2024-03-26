Feature: Login User
  User login with with json

#  Positive
#  Login - Successful
  @Tugas
  Scenario: Post login user with valid email and password
    Given Login user with valid json "LoginUserValid.json"
    When Send request post login user
    Then Status code should be 200
    And Validate json schema "LoginUserValidJsonSchema.json"


#    Negative
#  Login - Unsuccessful
  @Tugas
  Scenario Outline: Post login user with invalid email and valid password
    Given Login user with invalid "<JSON>"
    When Send request post login user
    Then Status code should be 400
    Examples:
      | JSON                                         |  |
      | LoginUserInvalidEmail.json                   |  |
      | LoginUserInvalidPassword.json                |  |
      | LoginUserInvalidEmailAndInvalidPassword.json |  |
