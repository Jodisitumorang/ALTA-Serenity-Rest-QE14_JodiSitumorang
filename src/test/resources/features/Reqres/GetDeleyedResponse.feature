Feature: Deleyed response
  Get deleyed response user

#  Positive
  @Tugas
  Scenario Outline: Get deleyed response user with valid parameter
    Given Deleyed Response user with valid parameter page <delay>
    When Send request Deleyed Response user
    Then Status code should be 200
    And Response Body page should be <delay>
    And Validate json schema "GetDeleyedResponse.json"
    Examples:
      | delay |
      | 1     |

#    Negative
  @Tugas
  Scenario Outline: Get deleyed response user with invalid parameter
    Given Deleyed response user with invalid parameter teks "<delay>"
    When Send Request Deleyed Response user with invalid parameter
    Then Status code should be 400
    Examples:
      | delay  |
      | satu |
