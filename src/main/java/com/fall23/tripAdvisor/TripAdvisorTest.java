package com.fall23.tripAdvisor;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class TripAdvisorTest extends BaseTest {

//
//
//    @Test
//    void Test1() {
//        openTheSite("https://www.tripadvisor.ru/");
//        WebElement whereAreYouGo = driver.findElement(By.xpath("//div[@class='biGQs _P fiohW hEDHV izyXJ']"));
//
//        String actualResult = driver.findElement(By.xpath("//div[@class='biGQs _P fiohW hEDHV izyXJ']")).getText();
//        String expectedResul = "Куда Вы едете?";
//        Assert.assertEquals(actualResult, expectedResul);
//    }
//        @Test
//        void Test2() throws InterruptedException {
//            openTheSite("https://www.tripadvisor.ru/");
//
//            WebElement searchButton = driver.findElement(By.xpath("//input[@type='search']"));
////            String actualSearchBtn = driver.findElement(By.xpath("//input[@placeholder='Куда сходить, чем заняться, где остановиться...']")).getAccessibleName();
////            String expectedSearchBtn = "Куда сходить, чем заняться, где остановиться...";
//           // Assert.assertEquals(actualSearchBtn, expectedSearchBtn);
//            searchButton.click();
//            searchButton.sendKeys("Стамбул");
//            Thread.sleep(6000);
//        }
        @Test
    void Test() throws InterruptedException {
            openTheSite("https://www.youtube.com/");
//            WebElement searchInputFieldBtn2 = driver.findElement(By.xpath("//input[@id='search']"));
//            searchInputFieldBtn2.sendKeys("Ludovico Einaudi");
//
//            WebElement searchBtnY = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
//            searchBtnY.click();
//
//            WebElement searchPlay = driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/hN_q-_nGv4U/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAcndM38hZ5uguWkEk7KwUEyxFV5g']"));
//            searchPlay.click();

            String actualName =driver.findElement(By.xpath("//*[@id=\"endpoint\"]")).getText();
            String expectedName ="Главная";
            Assert.assertEquals(actualName,expectedName);
           // String actualSearch = findElementByXPath("//*[@id=\"endpoint\"]").getText();

            Thread.sleep(10000);
        }

        }



