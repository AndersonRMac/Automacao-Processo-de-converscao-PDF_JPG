package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageActions {

    ChromeDriver driver;

    public void AbreNavegador(String url){
        driver.get(url);
    }
    public void AdicionaArquivo(String localArquivo){

        driver.findElement(By.className("fileupload")).sendKeys(localArquivo);
    }
    public void ClicaBotaoConversao(){
        WebElement botaoConverter = driver.findElement(By.id("convertSelectedBtn"));
        botaoConverter.click();
    }
    public void ClicaBotaoDownload(){
        try {
            Thread.sleep(5000);
            System.out.println("Rolou o tempo");
        } catch (InterruptedException e) {
            System.out.println("Não rolou o tempo!");;
        }
        driver.switchTo().frame("taskResultsFrame");
        WebElement botaoDownload = driver.findElement(By.id("download-btn"));
        botaoDownload.click();
    }

    public PageActions(ChromeDriver driver){
        this.driver = driver;
    }

}
