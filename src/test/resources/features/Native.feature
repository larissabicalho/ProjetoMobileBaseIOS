Feature: Acessar app
  @app
  Scenario: Verificar ContentScrolling
    And clicar no menu Native
    And clicar em ImageGallery
    And verificar se existe galeria

  @app
  Scenario: Verificar ContentScrolling
    And clicar no menu Native
    And clicar no menu ContentScrolling
    And verificar se esta na tela

  @app
  Scenario: Verificar ContentScrolling
    And clicar no menu Native
    And clicar em TableOfElements
    And ir ate o Elemento 39
    Then verificar Texto 39

  @app
  Scenario: Verificar ContentScrolling
    And clicar no menu Native
    And clicar no menu VideoPlayer
    And verificar se o video apareceu

  @app
  Scenario: Verificar ContentScrolling
    And clicar no menu Native
    And clicar no menu ContentOutOfView
    And verificar se o texto escondido aparece