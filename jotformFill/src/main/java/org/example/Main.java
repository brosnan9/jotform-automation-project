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

        //Enter First and Last Name
        enterText(driver,"first_3", "Gerson");
        enterText(driver,"last_3", "Pereira");

        //Select D.O.B
        selectValueFromDropdown(driver, "input_4_month", "January" );
        selectValueFromDropdown(driver, "input_4_day", "22" );
        selectValueFromDropdown(driver, "input_4_year", "2000");

        //Select Instrument
        selectValueFromDropdown(driver, "input_5", "Bass");

        //Click and choose days of week
        clickCheckbox(driver, "input_6_0");
        clickCheckbox(driver, "input_6_1");
        clickCheckbox(driver, "input_6_3");
        clickCheckbox(driver, "input_6_4");
        clickCheckbox(driver, "input_6_6");

        //Scroll to the element box and enter comment
        scrollToElementAndEnterText(driver, "input_8", "Commenting for Better Utilisation of comment Box");

        Thread.sleep(3000);
        driver.quit();
    }

    public static void enterText(WebDriver driver, String id, String text){

        WebElement firstName = driver.findElement(By.id(id));
        firstName.sendKeys(text);
    }
    public static void selectValueFromDropdown(WebDriver driver, String id, String text){

        //Input Birth Date from dropdown
        WebElement dropdown = driver.findElement(By.id(id));
        Select dropdownOption = new Select(dropdown);
        dropdownOption.selectByValue(text);
    }

    public static void clickCheckbox(WebDriver driver, String id){
        WebElement day = driver.findElement(By.id(id));
        day.click();
    }

    public static void scrollToElementAndEnterText(WebDriver driver, String id, String text){
        //Scroll to the Comment Element and Enter a text
        WebElement comment = driver.findElement(By.id(id));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", comment);
        comment.click();
        comment.sendKeys(text);
    }
}