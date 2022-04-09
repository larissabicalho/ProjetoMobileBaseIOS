Feature: Home App
  @app
  Scenario Outline: Acessa Home
    And clicar no menu Input
    And escrever Texto <texto>
    Then verificar se o texto esta escrito <texto>
    Examples:
      |texto|
      |Texto 2|
      |Texto 3|
      |Texto 4|
      |Texto 5|
      |Texto 6|
      |Texto 7|
  @app
  Scenario: Acessa Home
    And clicar no menu Input
    And clicar no segundo Info
    And clicar no moreInfo
    Then verificar se o information

  @app
  Scenario: Acessa Home
    And clicar no menu Input
    And clicar no segundo Info
    And clicar no moreInfo
    And clicar no information
    Then verificar se o add foi clicado

  @app
  Scenario: Acessa Home
    And clicar no menu Input
    And clicar no terceiro Info
    And procurar no DataPicker
    And trocar o Picker
    And trocar o mes
    And trocar o ano
    And trocar o hidden
    Then verificar a data

  @app
  Scenario: Acessa Home
    And clicar no menu Input
    And clicar no quarta Info
    Then verificar Label 1

  @app
  Scenario: Acessa Home
    And clicar no menu Input
    And clicar no quarta Info
    Then verificar Label 2

  @app
  Scenario: Acessa Home
    And clicar no menu Input
    And clicar no quarta Info
    Then verificar quantidade de label

  @app
  Scenario: Acessa Home
    And clicar no menu Input
    And clicar no sexta Info
    And clicar no toggle
    Then verificar se toggle foi clicado

  @app
  Scenario Outline: Acessa Home
    And clicar no menu Input
    And clicar no nona Info
    And clicar no spinner <spinner>

    Examples:
      |spinner|
      |Selection 1|
      |Selection 2|
      |Selection 3|
      |Selection 4|
      |Selection 5|

  @app
 Scenario: Acessa Home
    And clicar no menu Input
    And clicar no decima Info
    And swippe leve no objeto
    And verificar a mudanca

