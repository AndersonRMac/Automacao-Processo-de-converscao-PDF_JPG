Feature: Validar conversão de arquivo PDF para JPG
  Scenario: Aplicação transformar um PDF em um JPG
    Given o operador esteja no site: "https://www.sejda.com/pt/pdf-to-jpg"
    And Anexe um arquivo PDF
    And Clique em converter
    When For clicado no botao Download
    Then O arquivo devera ser baixado no formato JPG.
