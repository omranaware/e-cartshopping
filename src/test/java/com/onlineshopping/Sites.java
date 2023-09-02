package com.onlineshopping;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sites {

    WebDriver driver;

    @BeforeMethod
        public void OpenGoogle() {

        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void SessionClose(){
        driver.close();
    }

@Test
@Description("check amazon")
    public void OpenAmazon() throws Exception{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Amazon");
        Thread.sleep(1000);
        driver.findElement(By.xpath(" //b[contains(text(),' india')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@href='https://www.amazon.in/'])[2]")).click();

    }


    @Test
    @Description("check Flipkart")
    public void OpenFlipkart() throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("flipkart");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Flipkart')//]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='https://www.flipkart.com/']")).click();

    }



    @Test
    @Description("check Myntra")
    public void OpenMyntra() throws Exception{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Myntra");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='jZ2SBf']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@href='https://www.myntra.com/'])[1]")).click();

    }

    @Test
    @Description("check Ajio")
    public void OpenAjio () throws Exception{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("ajio");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='jZ2SBf']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@href='https://www.ajio.com/'])[1]")).click();
    }
}
