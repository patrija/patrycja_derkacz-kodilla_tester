package com.kodilla.selenium.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.pkobp.pl/");

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
