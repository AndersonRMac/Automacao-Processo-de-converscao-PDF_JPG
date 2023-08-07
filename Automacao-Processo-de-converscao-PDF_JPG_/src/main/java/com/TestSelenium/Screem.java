package com.TestSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;

public class Screem extends JFrame implements ActionListener {

    JTextField text;
    JFrame jFrame;

    public Screem(){
        jFrame = new JFrame();
        setTitle("Conversor PDF / JPG");
        //Configurações das dimenções da janela
        setSize(600,120);
        // Ao clicar no botão de fechar ele vai encerrar o código
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Bloqueia a opção de vc mexer no tamanho da tela
        setResizable(false);
        //Aplicação inicializa no meio da tela.
        setLocationRelativeTo(null);
        setLayout(null);

        JButton jButton = new JButton("OK");
        //Configura o tamanho do botão
        jButton.setBounds(450, 30, 120,20);
        jButton.setFont(new Font("Arial", Font.BOLD, 12));
        add(jButton);

        //Ligo a ação ao botão
        jButton.addActionListener(this);

        text = new JTextField();
        text.setBounds(10, 30, 410,20);
        text.setFont(new Font("Arial",Font.PLAIN,12));

        add(text);

        JLabel jLabel = new JLabel("Insira aqui o nome do arquivo que será convertido, com a extensão. Ex.: 'arquivo.pdf'");
        jLabel.setBounds(10,5,500,20);
        add(jLabel);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String arquivo = text.getText();
        String local = "C:\\Users\\t_anderson.maciel\\Desktop\\TERMO\\" + arquivo;
        String url = "https://www.sejda.com/pt/pdf-to-jpg";


        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        navegador.get(url);
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        navegador.manage().window().maximize();

        //Encontro o elemento web no site que condiz com o upload e envio para ele o local do arquivo.
        navegador.findElement(By.className("fileupload")).sendKeys(local);

        //Clico no botão de conversão
        WebElement botaoConverter = navegador.findElement(By.id("convertSelectedBtn"));
        botaoConverter.click();

        /*Ao fazer a conversão do arquivo a página abre um novo frame,
         com isso tenho que selecionar o frame que contém o elemento
         que eu preciso para fazer o download do arquivo convertido*/


        //Clico no botão para download do arquivo.
        navegador.switchTo().frame("taskResultsFrame");
        WebElement BtDownloadFrame = navegador.findElement(By.id("download-btn"));
        BtDownloadFrame.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        navegador.quit();

    }


}
