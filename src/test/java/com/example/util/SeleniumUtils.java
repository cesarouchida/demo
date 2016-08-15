package com.example.util;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SeleniumUtils {
    private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_hhmmssaa");

    private static String workingDir = getDir();

    protected WebDriver driver ;

    static {
        workingDir = getDir();
    }

    @Before
    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
//        driver = new ChromeDriver();
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }


    protected static void tiraScreenshot(String fileName, WebDriver driver) {

        String destFile = fileName + "_" + dateFormat.format(new Date()) + ".png";

        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(scrFile, new File(workingDir + File.separator+ destFile));

            System.out.println("Gravando screenshot em " + workingDir + File.separator+ destFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getDir() {

        String workingDir = System.getProperty("user.dir") + File.separator + "target" +File.separator + "shots" ;

        boolean b = new File(workingDir).mkdirs();

        System.out.println("Diretorio das imagens: " + workingDir);

        return workingDir;

    }

}
