package steps;


import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.PageActions;

import java.time.Duration;

public class Steps {

    String local = "C:\\Users\\t_anderson.maciel\\Desktop\\TERMO\\LogoSelenium.pdf";
    String url = "https://www.sejda.com/pt/pdf-to-jpg";
    ChromeOptions options = new ChromeOptions();
    ChromeDriver driver = new ChromeDriver(options);
    PageActions actions = new PageActions(driver);


    @Test
    @Given("O navegador for iniciado")
    public void o_navegador_for_iniciado() {
        actions.AbreNavegador(url);
    }

    @Test
    @And("arquivo PDF for adicionado")
    public void arquivo_pdf_for_adicionado() {
        actions.AdicionaArquivo(local);
    }

    @Test
    @And("for clicado no botao de conversao")
    public void for_clicado_no_botao_de_conversao() {
        actions.ClicaBotaoConversao();
    }

    @Test
    @When("apos a conversao for clicado no botao de download")
    public void apos_a_conversao_for_clicado_no_botao_de_download() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Não rolou o tempo!");;
        }
        actions.ClicaBotaoDownload();
    }

    @Then("devera ser baixado um arquivo no formato JPG")
    public void devera_ser_baixado_um_arquivo_no_formato_jpg() {

        driver.quit();
    }




}
