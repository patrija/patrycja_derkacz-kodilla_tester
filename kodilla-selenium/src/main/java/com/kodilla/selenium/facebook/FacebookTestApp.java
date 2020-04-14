package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");

        WebElement dayCombo = driver.findElement(By.xpath("//select"));
        Select daySelect = new Select(dayCombo);
        daySelect.selectByValue("15");

        WebElement monthCombo = driver.findElement(By.xpath("//select[2]"));
        Select monthSelect = new Select(monthCombo);
        monthSelect.selectByValue("9");

        WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByValue("1993");
    }
}
