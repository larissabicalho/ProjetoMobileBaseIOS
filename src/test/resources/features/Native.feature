Feature: Native
  @app
  Scenario: Galeria Existente
    And clicar no menu Native
    And clicar em ImageGallery
    And verificar se existe galeria

  @naoRodarBrowserstack
  Scenario: Verificar ContentScrolling
    And clicar no menu Native
    And clicar no menu ContentScrolling
    And verificar se esta na tela

  @app
  Scenario: TableOfElements
    And clicar no menu Native
    And clicar em TableOfElements
    And ir ate o Elemento 39
    Then verificar Texto 39

  @app
  Scenario: VideoPlayer
    And clicar no menu Native
    And clicar no menu VideoPlayer
    And verificar se o video apareceu

  @app
  Scenario: ContentOutOfView
    And clicar no menu Native
    And clicar no menu ContentOutOfView
    And verificar se o texto escondido aparece