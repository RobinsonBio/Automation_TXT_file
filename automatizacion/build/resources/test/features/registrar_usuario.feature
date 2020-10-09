Feature: user register
  I as user
  Want to get access to the page
  to choose a basic plan

  Scenario Outline: successful user registration
    Given the user is on the main page
    When he chooses a plan
    And he registers on the page
      | email   | password   | password1   |
      | <email> | <password> | <password1> |
    Then he will see the message En este momento, nuestro sitio no permite cuentas gratuitas, ni nuevos formularios nuevos. ¡Lo sentimos!.
    Examples:
      | email                          | password | password1 |
      | robinquinte123323@gmail.com    | 123456   | 123456    |
      | robinquinte123323333@gmail.com | 1234567  | 1234567   |
