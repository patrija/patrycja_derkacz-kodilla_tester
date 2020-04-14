package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        driver.manage().window().maximize();

        WebElement acceptButton = driver.findElement(By.xpath("//*[@class=\"_13q9y _8hkto _11eg6 _7qjq4 _ey68j\" and @data-role=\"accept-consent\"]"));
        acceptButton.click();

        WebElement inputField = driver.findElement(By.name("string"));
        inputField.sendKeys("mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("//select[@class=\"_d25db_2P-5I _1h7wt _k70df _7qjq4\" and @data-role=\"filters-dropdown-toggle\"]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByValue("/kategoria/elektronika");

        WebElement searchButton = driver.findElement(By.xpath("//*[@class=\"_d25db_1t06j _13q9y _8tsq7 _1q2ua\" and @data-role=\"search-button\"]"));
        searchButton.click();
    }
}

