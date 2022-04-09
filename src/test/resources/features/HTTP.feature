Feature: Acessar app
  @app
  Scenario Outline: Verificar Se Acessou o Google
    And clicar no menu HTTP
    And entrar no site
    And selecionar o site <web>
    Then valido o site

    Examples:
    |web|
    |https://www.google.com.br|