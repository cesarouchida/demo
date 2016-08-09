package com.example.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class IndexControllerTest {

    private final String HOME = "http://localhost:8080/demo";
    private final String INDEX = "http://localhost:8080/demo/index";

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void acessaPaginaInicial(){
        driver.get(HOME);

        assertTrue(driver.getPageSource().contains("Olá Mundo"));
    }

    @Test
    public void verificaSeTemNomeContato(){
        driver.get(INDEX);

        assertTrue(driver.getPageSource().contains("Joao"));
    }
}