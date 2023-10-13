package org.example;
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

        try {
            driver.get("https://form.jotform.com/210892689605366");

            enterValue enterValue = new enterValue();
            //Enter First and Last Name
            enterValue.enterText(driver, "first_3", "Gerson");
            enterValue.enterText(driver, "last_3", "Pereira");

            dropdownValue dropdownValue = new dropdownValue();
            //Select D.O.B
            dropdownValue.selectValueFromDropdown(driver, "input_4_month", "January");
            dropdownValue.selectValueFromDropdown(driver, "input_4_day", "22");
            dropdownValue.selectValueFromDropdown(driver, "input_4_year", "2000");

            //Select Instrument
            dropdownValue.selectValueFromDropdown(driver, "input_5", "Bass");

            checkboxValue checkboxValue = new checkboxValue();
            //Click and choose days of week
            checkboxValue.clickCheckbox(driver, "input_6_0");
            checkboxValue.clickCheckbox(driver, "input_6_1");
            checkboxValue.clickCheckbox(driver, "input_6_3");
            checkboxValue.clickCheckbox(driver, "input_6_4");
            checkboxValue.clickCheckbox(driver, "input_6_6");

            scrollTo scrollTo = new scrollTo();
            //Scroll to the element box and enter comment
            scrollTo.scrollToElement(driver, "input_8");
            enterValue.enterText(driver, "input_8", "Commenting for Better Utilisation of comment Box");
        }
        catch (NoSuchElementException e)
        {
            e.printStackTrace();
        } finally
        {
            Thread.sleep(3000);
            driver.quit();
        }
}







}