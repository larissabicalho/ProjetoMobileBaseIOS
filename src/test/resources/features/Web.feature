Feature: Home App

  @app
  Scenario: Acessar Home Texto Inválido
    When clicar no menu lateral
    And clicar no menu Web
    Then verificar se esta na amazon
