package com.projera;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://demoqa.com/webtables");
            driver.manage().window().maximize();

            Thread.sleep(2000);

            WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
            addButton.click();

            Thread.sleep(1000);

            WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
            WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
            WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
            WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
            WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
            WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
            WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));


            firstName.sendKeys("Uğur");
            lastName.sendKeys("Akşahin");
            userEmail.sendKeys("uguraksahinn@hotmail.com");
            age.sendKeys("28");
            salary.sendKeys("30000");
            department.sendKeys("Electronic Engineering");
            submit.click();

            Thread.sleep(2000);


            WebElement editButton = driver.findElement(By.xpath("//span[@title='Edit']"));
            editButton.click();

            Thread.sleep(1000);

            WebElement deleteButton = driver.findElement(By.xpath("//span[@title='Delete']"));
            deleteButton.click();

            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
