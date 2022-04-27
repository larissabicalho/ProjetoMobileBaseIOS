Feature: Web

  @app
  Scenario: Amazon
    When clicar no menu lateral
    And clicar no menu Web
    Then verificar se esta na amazon
