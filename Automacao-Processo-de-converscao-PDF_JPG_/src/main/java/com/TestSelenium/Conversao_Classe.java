package com.TestSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Scanner;

public class Conversao_Classe {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        String nome_arquvio;
        System.out.println("Insira aqui o nome do arquivo que será convertido, com a extensão, ex: arquivo.pdf");
        nome_arquvio = in.nextLine();

        String arquivo_editado = "C:\\Users\\ander\\OneDrive\\Área de Trabalho\\TERMO\\" + nome_arquvio;
        String arquivo = arquivo_editado;
        String url = "https://www.sejda.com/pt/pdf-to-jpg";





        /*

        //Encontro o elemento web no site que condiz com o upload e envio para ele o local do arquivo.
        navegador.findElement(By.className("fileupload")).sendKeys(arquivo);

        //Clico no botão de conversão
        WebElement botaoConverter = navegador.findElement(By.id("convertSelectedBtn"));
        botaoConverter.click();

        /*Ao fazer a conversão do arquivo a página abre um novo frame,
         com isso tenho que selecionar o frame que contém o elemento
         que eu preciso para fazer o download do arquivo convertido*/

        //Clico no botão para download do arquivo.
       /* navegador.switchTo().frame("taskResultsFrame");
        WebElement BtDownloadFrame = navegador.findElement(By.id("download-btn"));
        BtDownloadFrame.click();

        Thread.sleep(10000);
        navegador.quit();

        */

    }
    public void AbreNavegador(String site) {

        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        navegador.get(site);
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        navegador.manage().window().maximize();
    }
}
