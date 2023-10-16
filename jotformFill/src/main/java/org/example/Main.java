package org.example;
import Pages.formy;
import Pages.jotForm;
import formActions.checkboxValue;
import formActions.dropdownValue;
import formActions.enterValue;
import formActions.scrollTo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/gersonbrosnanpereira/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try{
            driver.get("https://formy-project.herokuapp.com/form");
            formy.stepsFormy(driver);

            driver.get("https://form.jotform.com/210892689605366");
            jotForm.stepsJotForm(driver);
        }
        catch (NoSuchElementException e)
        {
            e.printStackTrace();
        }
        finally {
            Thread.sleep(3000);
            driver.quit();
        }
    }
}