package com.fall23.locators;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;


public class ByXPathDemo extends BaseTest {

    @Test
    void demo1 () throws InterruptedException {
        openTheSite ("https://demoqa.com/text-box");

        WebElement fullNameInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));

        fullNameInput.sendKeys("John Doe");
        Thread.sleep(5000);
    }
}
