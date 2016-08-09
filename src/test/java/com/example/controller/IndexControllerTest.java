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
        if (this.driver != null) {
            driver.manage().deleteAllCookies();
            driver.close();
        }
    }

    @Test
    public void acessaPaginaInicial(){

        if(driver == null) setUp();
//        drivers.get(HOME);
        driver.navigate().to(HOME);

        assertTrue(driver.getPageSource().contains("Olá Mundo"));

        if (driver != null) tearDown();
    }

    @Test
    public void verificaSeTemNomeContato(){
        if(driver == null) setUp();

//        drivers.get(INDEX);
        driver.navigate().to(INDEX);
        assertTrue(driver.getPageSource().contains("Joao"));

        if (driver != null) tearDown();
    }
}