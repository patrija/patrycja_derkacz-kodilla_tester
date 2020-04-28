Feature: Is number divided by 3 or 5?

  Scenario Outline: Number is divided by 3 or 5 or not
    Given number is <number>
    When I ask whether is divided by three or five
    Then I should be to told <message>
    Examples:
      |number      |message|
      |tree        |"Fizz" |
      |nine        |"Fizz" |
      |twenty seven|"Fizz"|
      |five        |"Buzz"|
      |twenty      |"Buzz"|
      |zero        |"FizzBuzz"|
      |fifteen     |"FizzBuzz"|
      |sixty       |"FizzBuzz"|
      |one         |"None"    |
