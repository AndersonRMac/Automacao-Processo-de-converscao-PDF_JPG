Feature: Validar conversão de arquivo PDF para JGP
  Scenario: Processo completo no site de conversão
    Given que o usuário entre no site "https://www.sejda.com/pt/pdf-to-jpg"
    And Anexe um arquivo PDF
    And Clique em converter
    When For clicado no botão Download
    Then O arquivo deverá ser baixado no formato JPG.
