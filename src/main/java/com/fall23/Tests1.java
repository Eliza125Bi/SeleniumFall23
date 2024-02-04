package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.fall23.WebDriverManager.driver;
import static com.fall23.WebDriverManager.openTheSite;
import static com.fall23.WebElementManager.*;

public class Tests1 {

    @BeforeClass
    void data(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    void byIdTest(){

        openTheSite("https://demoqa.com/text-box");
        WebElement usernameInput = byID("userName");
        WebElement emailInput = byID("userEmail");
        WebElement currentAddressInput = byID("currentAddress");
        WebElement permanentAddressInput = byID("permanentAddress");
        WebElement submitBtn= byID("submit");

        usernameInput.sendKeys("John");
        emailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovet 123");

        scrollBy(0,600);
        submitBtn.click();

    }

    @Test
    void testClassName(){
        openTheSite("https://demoqa.com/text-box");

        WebElement usernameInput = byID("userName");
        WebElement emailInput = byID("userEmail");
        WebElement currentAddressInput = byID("currentAddress");
        WebElement permanentAddressInput = byID("permanentAddress");
        WebElement submitBtn= byClassName("btn-primary");

        usernameInput.sendKeys("John");
        emailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovet 123");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        submitBtn.click();
    }

    @Test
    void testLinkedText() throws InterruptedException {
        openTheSite(" https://demoqa.com/links");

        WebElement home = byLinkedText("Home");
        home.click();
        Thread.sleep(5000);
    }
    @Test
    void testPartText() {
        openTheSite(" https://demoqa.com/links");
        WebElement Unauth = byPartialLink("Unauth");
        Unauth.click();
    }

    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
