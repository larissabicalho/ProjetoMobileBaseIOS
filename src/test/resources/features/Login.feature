Feature: Login

  @app
  Scenario: Login Admin
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login
    Then verificar Login Admin

  @app
  Scenario: Login Invalido
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login errado
    Then verificar Login Errado


  @naoRodarBrowserstack
  Scenario: Logout
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login
    And clicar Logout
    Then verificar tela principal

  @naoRodarBrowserstack
  Scenario: TryButton
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login errado
    And clicar TryButton
    Then verificar tela principal
