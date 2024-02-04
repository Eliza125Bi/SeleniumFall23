package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.fall23.WebDriverManager.driver;

public class WebElementManager {

public static WebElement byID (String ID){
    return driver.findElement(By.id(ID));
}

public static WebElement byClassName (String ClassName){
    return driver.findElement(By.className(ClassName));
}

public static WebElement byLinkedText(String LinkText){
    return driver.findElement(By.linkText(LinkText));
}

public static WebElement byPartialLink(String partText){
    return driver.findElement(By.partialLinkText(partText));
}

    // Метод для выполнения прокрутки страницы
    public static void scrollBy(int offsetX, int offsetY) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = String.format("window.scrollBy(%d, %d)", offsetX, offsetY);
        js.executeScript(script);
    }
}
