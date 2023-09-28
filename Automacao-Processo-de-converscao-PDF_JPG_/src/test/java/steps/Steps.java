package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Steps {

    ChromeDriver driver;
    String local = "C:\\Users\\ander\\OneDrive\\Área de Trabalho\\TERMO\\LogoSelenium.pdf";
    String url = "https://www.sejda.com/pt/pdf-to-jpg";

    @BeforeEach
    @Test
    @Given("O navegador for iniciado")
    public void o_navegador_for_iniciado() {

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);

    }

    @When("arquivo PDF for adicionado")
    public void arquivo_pdf_for_adicionado() {

    }

    @When("for clicado no botao de conversao")
    public void for_clicado_no_botao_de_conversao() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("apos a conversao for clicado no botao de download")
    public void apos_a_conversao_for_clicado_no_botao_de_download() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("devera ser baixado um arquivo no formato JPG")
    public void devera_ser_baixado_um_arquivo_no_formato_jpg() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}



















/**
 @Test
 @Given("o operador esteja no site: {string}")
 public void o_operador_esteja_no_site() {

 drive.get(url);
 drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 drive.manage().window().maximize();

 }

 @Test
 @And("Anexe um arquivo PDF")
 public void anexe_um_arquivo_pdf() {
 drive.findElement(By.className("fileupload")).sendKeys(local);

 }

 @Test
 @And("Clique em converter")
 public void clique_em_converter() {
 WebElement botaoConverter = drive.findElement(By.id("convertSelectedBtn"));
 botaoConverter.click();
 }

 @Test
 @When("For clicado no botao Download")
 public void for_clicado_no_botao_download() {
 drive.switchTo().frame("taskResultsFrame");
 WebElement BtDownloadFrame = drive.findElement(By.id("download-btn"));
 BtDownloadFrame.click();
 }

 @Test
 @Then("O arquivo devera ser baixado no formato JPG.")
 public void o_arquivo_devera_ser_baixado_no_formato_jpg() {

 }
 */
