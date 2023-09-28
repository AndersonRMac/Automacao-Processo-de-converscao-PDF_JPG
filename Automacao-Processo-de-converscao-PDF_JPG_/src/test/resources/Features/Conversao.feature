
Feature: Realizar fluxo de Conversao PDF para JPG
  Scenario: Testar Fluxo de Conversao no site
    Given O navegador for iniciado
    When  arquivo PDF for adicionado
    When for clicado no botao de conversao
    When apos a conversao for clicado no botao de download
    Then devera ser baixado um arquivo no formato JPG

