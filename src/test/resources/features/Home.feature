Feature: Home App

  @app
  Scenario: Acessa Home
    And clicar no menu Home
    Then valido frase Home

    @app
  Scenario: Acessar Home Texto Inválido
    And clicar no menu Home
    Then valido frase Home