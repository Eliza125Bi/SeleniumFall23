package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLogin {
    public WebDriver driver;

    @BeforeClass
    void data(){

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test (description = "loginTest")
    void loginTest(){

        String actualLoginText = driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";

        Assert.assertEquals(actualLoginText,expectedLoginText);

        String username = "Admin";
        String password = "admin123";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualDashboardText = driver.findElement(By.tagName("h6")).getText();
        String expectedDashboardText ="Dashboard";
        Assert.assertEquals(actualDashboardText,expectedDashboardText);


    }
    @Test (description = "loginWithValidUserNameAndInvalidPassword")
    void loginWithValidUserNameAndInvalidPassword(){
        String actualLoginText =driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        String username = "Admin";
        String password = "Admin123";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualPasswordText =driver.findElement(By.tagName("p")).getText();;
        String expectedPasswordText = "Invalid credentials";
        Assert.assertEquals(actualPasswordText,expectedPasswordText);
    }

    @Test (description = "loginWithInvalidUserNameAndValidPassword")
    void loginWithInvalidUserNameAndValidPassword(){
        String actualLoginText =driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        String username = "Aigesha";
        String password = "admin123";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualLogin2Text =driver.findElement(By.tagName("p")).getText();;
        String expectedLogin2Text = "Invalid credentials";

        Assert.assertEquals(actualLogin2Text,expectedLogin2Text);
    }
    @Test (description = "loginWithInvalidUserNameAndInvalidPassword")
    void loginWithInvalidUserNameAndInvalidPassword(){
        String actualLoginText =driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        String username = "Eliza";
        String password = "Admin1234";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();
    }
    @Test (description = "messageForgotPassword")
    void messageForgotPassword(){
        String actualLoginText =driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        String username = "Admin";
        String password = "Admin1234";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        WebElement forgBtn = driver.findElement(By.xpath("//*[@class=\"oxd-text oxd-text--p " +
                "orangehrm-login-forgot-header\"]"));
        forgBtn.click();
    }
    @Test (description = "messageForgotPasswordValidUserName")
    void messageForgotPasswordValidUserName(){
        String actualLoginText =driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        String username = "Admin";
        String password = "Admin1234";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        WebElement forgBtn = driver.findElement(By.xpath("//*[@class=\"oxd-text oxd-text--p " +
                "orangehrm-login-forgot-header\"]"));
        forgBtn.click();

        String actualForgotPasswordText =driver.findElement(By.xpath("//*[@id=\"app\"]" +
                "/div[1]/div[1]/div/form/p")).getText();
        String expectedForgotPasswordText = "Please enter your username to identify your account to reset your password";
        Assert.assertEquals(actualForgotPasswordText, expectedForgotPasswordText);

        String actualResetPasswordText =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/h6")).getText();
        String expectedResetPasswordText = "Reset Password";
        Assert.assertEquals(actualResetPasswordText, expectedResetPasswordText);

        String actualForgotUsernameText =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div" +
                "/form/div[1]/div/div[1]/label")).getText();
        String expectedForgotUsernameText = "Username";
        Assert.assertEquals(actualForgotUsernameText, expectedForgotUsernameText);

        String ForgotPasswordUserName = "Admin";

        WebElement usernameForgotPassword= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]" +
                "/div[1]/div/form/div[1]/div/div[2]/input"));
        usernameForgotPassword.sendKeys(ForgotPasswordUserName);

        WebElement ResetPasswordBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/" +
                "div[2]/button[2]"));
        ResetPasswordBtn.click();
    }
    @Test(description = "buttonCancel")
    void buttonCancel(){

        String actualLoginText =driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        String username = "Eliza";
        String password = "Admin1234";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        WebElement forgBtn = driver.findElement(By.xpath("//*[@class=\"oxd-text oxd-text--p " +
                "orangehrm-login-forgot-header\"]"));
        forgBtn.click();

        String actualResetPasswordText =driver.findElement(By.tagName("h6")).getText();
        String expectedResetPasswordText = "Reset Password";
        Assert.assertEquals(actualResetPasswordText, expectedResetPasswordText);

        String actualResetMessageText =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/p/p")).getText();
        String expectedResetMessageText = "Please enter your username to identify your account to reset your password";
        Assert.assertEquals(actualResetMessageText, expectedResetMessageText);

        WebElement buttonCancel =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[1]"));
        buttonCancel.click();
    }

    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }}
