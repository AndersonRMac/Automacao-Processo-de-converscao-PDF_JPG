
Feature: Realizar fluxo de Conversao PDF para JPG
  Scenario: Testar Fluxo de Conversao no site
    Given O navegador for iniciado
    And  arquivo PDF for adicionado
    And for clicado no botão de conversao
    And apos a conversao for clicado no botao de download
    Then devera ser baixado um arquivo no formato JPG