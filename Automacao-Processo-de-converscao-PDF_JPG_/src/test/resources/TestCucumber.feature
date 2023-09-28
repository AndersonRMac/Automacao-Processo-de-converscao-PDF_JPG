Feature: Validar conversão de arquivo PDF para JPG
  Scenario: Aplicação transformar um PDF em um JPG
    Given O navegador for iniciado
    And arquivo PDF for adicionado
    And for clicado no botao de conversao
    When apos a conversao for clicado no botao de download
    Then devera ser baixado um arquivo no formato JPG
