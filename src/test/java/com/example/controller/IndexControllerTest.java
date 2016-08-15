package com.example.controller;

import com.example.util.SeleniumUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IndexControllerTest extends SeleniumUtils {

    private final String HOME = "http://localhost:8080/demo";
    private final String INDEX = "http://localhost:8080/demo/index";

    @Test
    public void acessaPaginaInicial(){
//        if(this.driver == null) setUp();

        driver.get(HOME);

        assertTrue(driver.getPageSource().contains("Olá Mundo"));

        tiraScreenshot(this.getClass().getSimpleName(), driver);

//        if(this.driver != null) tearDown();
    }

    @Test
    public void verificaSeTemNomeContato(){
//        if(this.driver == null) setUp();

        driver.get(INDEX);

        assertTrue(driver.getPageSource().contains("Joao"));

        tiraScreenshot(this.getClass().getSimpleName(), driver);

//        if(this.driver != null) tearDown();

    }
}