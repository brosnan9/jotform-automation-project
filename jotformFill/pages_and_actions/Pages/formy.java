package Pages;

import formActions.checkboxValue;
import formActions.dropdownValue;
import formActions.enterValue;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class formy {
    public static void stepsFormy(WebDriver driver){
        //To Test out the Formy Page
            enterValue.enterText(driver, "first-name", "Gerson");
            enterValue.enterText(driver, "last-name", "Pereira");
            enterValue.enterText(driver, "job-title", "Quality Assurance Engineer");
            checkboxValue.clickCheckbox(driver, "radio-button-3");
            checkboxValue.clickCheckbox(driver, "checkbox-1");
            dropdownValue.selectValueFromDropdown(driver, "select-menu", "3");
            enterValue.enterText(driver, "datepicker","12/01/2000");
    }
}
