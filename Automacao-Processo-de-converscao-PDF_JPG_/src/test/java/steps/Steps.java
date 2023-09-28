package steps;


import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.PageActions;

import java.time.Duration;

public class Steps {

    PageActions actions;
    ChromeDriver driver;
    String local = "C:\\Users\\t_anderson.maciel\\Desktop\\TERMO\\LogoSelenium.pdf";
    String url = "https://www.sejda.com/pt/pdf-to-jpg";

    @Before
    public void before(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    @Given("O navegador for iniciado")
    public void o_navegador_for_iniciado() {
        driver.get(url);
    }

    @Test
    @And("arquivo PDF for adicionado")
    public void arquivo_pdf_for_adicionado() {

        actions = new PageActions(driver);
        actions.AdicionaArquivo(local);

    }

    @Test
    @And("for clicado no botao de conversao")
    public void for_clicado_no_botao_de_conversao() {
        WebElement botaoConverter = driver.findElement(By.id("convertSelectedBtn"));
        botaoConverter.click();
    }

    @Test
    @When("apos a conversao for clicado no botao de download")
    public void apos_a_conversao_for_clicado_no_botao_de_download() {
        driver.switchTo().frame("taskResultsFrame");
        WebElement BtDownloadFrame = driver.findElement(By.id("download-btn"));
        BtDownloadFrame.click();
    }

    @After
    @Then("devera ser baixado um arquivo no formato JPG")
    public void devera_ser_baixado_um_arquivo_no_formato_jpg() {
        driver.quit();
    }




}
