package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class Steps {

    String local = "C:\\Users\\ander\\OneDrive\\Área de Trabalho\\TERMO\\LogoSelenium.pdf" ;
    String url = "https://www.sejda.com/pt/pdf-to-jpg";
    ChromeOptions options = new ChromeOptions();
    ChromeDriver drive = new ChromeDriver(options);

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


}
