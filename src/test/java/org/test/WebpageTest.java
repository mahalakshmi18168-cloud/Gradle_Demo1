package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebpageTest {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://github.com/mahalakshmi18168-cloud/Gradle_Demo1");
    }

    @Test
    public void titleValidationTest() {


        String actualTitle = driver.getTitle();


        System.out.println("Page Title is : " + actualTitle);

        // Validate title using contains()
        Assert.assertTrue(actualTitle.contains("Gradle_Demo1"));
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {


        Thread.sleep(1000);


        driver.quit();
    }
}