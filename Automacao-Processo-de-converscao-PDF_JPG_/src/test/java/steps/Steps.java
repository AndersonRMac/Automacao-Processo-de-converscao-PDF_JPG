package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Steps {

    String url = "https://www.sejda.com/pt/pdf-to-jpg";
    ChromeOptions options = new ChromeOptions();
    ChromeDriver drive = new ChromeDriver(options);

    @Test
    @Given("o operador esteja no site: {string}")
    public void o_operador_esteja_no_site() {
        drive.get(url);
    }

    @And("Anexe um arquivo PDF")
    public void anexe_um_arquivo_pdf() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("Clique em converter")
    public void clique_em_converter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("For clicado no botao Download")
    public void for_clicado_no_botao_download() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("O arquivo devera ser baixado no formato JPG.")
    public void o_arquivo_devera_ser_baixado_no_formato_jpg() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
