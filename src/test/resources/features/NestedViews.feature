Feature: Home App

  @app
  Scenario Outline: Acessar Home Texto Inválido
    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no Next Level Back <valor>
    Then verificar Final Level <texto>
    Examples:
      |valor| texto |
      |4    | This is the fourth view|

  @app
  Scenario Outline: Verificar ContentScrolling

    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no Next Level Back <valor>
    Then verificar Final Level <texto>

    Examples:
      |valor| texto|
      |1 | This is the first view|
      |2 | This is the second view|
      |3 | This is the third view |
      |4 |This is the fourth view|

  @app
  Scenario: Verificar ContentScrolling

    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no More
    Then verificar se voltou para inicial

  @app
  Scenario Outline: Acessar Home Texto Inválido
    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no Next Level Back <valor>
    And clicar no Back Navigation
    Then verificar Final Level <texto>
    Examples:
      |valor| texto |
      |4    | This is the third view|