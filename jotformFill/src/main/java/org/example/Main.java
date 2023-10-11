package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/gersonbrosnanpereira/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://form.jotform.com/210892689605366");

        //Find Text Box element and enter First Name
        WebElement firstName = driver.findElement(By.id("first_3"));
        firstName.sendKeys("Gerson");

        //Find Text Box element and enter Second Name
        WebElement secondName = driver.findElement(By.id("last_3"));
        secondName.sendKeys("Pereira");

        //Input Birth Date from dropdown
        WebElement birthMonth = driver.findElement(By.id("input_4_month"));
        Select bMonth = new Select(birthMonth);
        bMonth.selectByValue("January");

        //Input Birth Day from dropdown
        WebElement birthDay = driver.findElement(By.id("input_4_day"));
        Select bDay = new Select(birthDay);
        bDay.selectByValue("22");

        //Input Birth Year from dropdown
        WebElement birthYear = driver.findElement(By.id("input_4_year"));
        Select bYear = new Select(birthYear);
        bYear.selectByValue("2000");

        //Find Instrument Element and select instrument from dropdown
        WebElement instrument = driver.findElement(By.id("input_5"));
        Select bass = new Select(instrument);
        bass.selectByValue("Bass");

        //Find each Day element and Select Checkboxes
        WebElement monday = driver.findElement(By.id("input_6_0"));
        monday.click();
        WebElement tuesday = driver.findElement(By.id("input_6_1"));
        tuesday.click();
        WebElement wednesday = driver.findElement(By.id("input_6_3"));
        wednesday.click();
        WebElement thursday = driver.findElement(By.id("input_6_4"));
        thursday.click();
        WebElement friday = driver.findElement(By.id("input_6_6"));
        friday.click();

        //Scroll to the Comment Element and Enter a text
        WebElement comment = driver.findElement(By.id("input_8"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", comment);
        comment.click();
        comment.sendKeys("Commenting for Better Utilisation of comment Box");

        Thread.sleep(1000);
        driver.quit();
    }
}