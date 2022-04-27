Feature: Alerts

  @app
  Scenario: Testar Botao Alerta
    When clicar no menu lateral
    And clicar no menu Alerts
    And clicar no botao Alert
    Then verificar a mensagem do alerta

  @app
  Scenario: Testar Modal
    When clicar no menu lateral
    And clicar no menu Alerts
    And clicar no botao Modal
    Then validar Mensagem
