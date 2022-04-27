Feature: Crash

  @app
  Scenario: Verificar Botao Crash
    When clicar no menu lateral
    And clicar no menu Crash
    Then verificar se existe o botao crash

