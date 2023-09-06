package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Scanner;

public class Conversao {

    private String url = "https://www.sejda.com/pt/pdf-to-jpg";
    private WebDriver navegador = new ChromeDriver();
    private String nome_arquvio;
    private String local = "C:\\Users\\t_anderson.maciel\\Desktop\\TERMO\\" + nome_arquvio;
    private Scanner in = new Scanner(System.in);

    @Given("O navegador for iniciado")
    public void oNavegadorForIniciado() {

        WebDriverManager.chromedriver().setup();
        navegador.get(url);
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        navegador.manage().window().maximize();

    }

    @And("arquivo PDF for adicionado")
    public void arquivoPDFForAdicionado() {

        System.out.println("Insira aqui o nome do arquivo que será convertido, com a extensão, ex: arquivo.pdf");
        nome_arquvio = in.nextLine();
        navegador.findElement(By.className("fileupload")).sendKeys(local);

    }

    @And("for clicado no botão de conversao")
    public void forClicadoNoBotãoDeConversao() {

        WebElement botaoConverter = navegador.findElement(By.id("convertSelectedBtn"));
        botaoConverter.click();

    }

    @And("apos a conversao for clicado no botao de download")
    public void aposAConversaoForClicadoNoBotaoDeDownload() {

        navegador.switchTo().frame("taskResultsFrame");
        WebElement BtDownloadFrame = navegador.findElement(By.id("download-btn"));
        BtDownloadFrame.click();

    }

    @Then("devera ser baixado um arquivo no formato JPG")
    public void deveraSerBaixadoUmArquivoNoFormatoJPG() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        navegador.quit();

    }
}
