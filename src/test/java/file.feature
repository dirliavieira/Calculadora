Feature: Realizar operações matemáticas na calculadora
  Como usuário
  Eu quero poder realizar operações matemáticas básicas na calculadora
  Para obter resultados precisos

  Scenario: Adicionar dois números
    Given I have a calculator
    When I enter the first number as "2"
    And I enter the second number as "3"
    And I choose the operation as "+"
    And I perform the calculation
    Then I should see the result as "5"

  Scenario: Subtrair dois números
    Given I have a calculator
    When I enter the first number as "5"
    And I enter the second number as "2"
    And I choose the operation as "-"
    And I perform the calculation
    Then I should see the result as "3"

  Scenario: Multiplicar dois números
    Given I have a calculator
    When I enter the first number as "4"
    And I enter the second number as "3"
    And I choose the operation as "*"
    And I perform the calculation
    Then I should see the result as "12"

  Scenario: Dividir dois números
    Given I have a calculator
    When I enter the first number as "10"
    And I enter the second number as "2"
    And I choose the operation as "/"
    And I perform the calculation
    Then I should see the result as "5"
