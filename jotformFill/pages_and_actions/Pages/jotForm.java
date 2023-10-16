package Pages;

import formActions.checkboxValue;
import formActions.dropdownValue;
import formActions.enterValue;
import formActions.scrollTo;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class jotForm {
    public static void stepsJotForm(WebDriver driver) {
        //To Test Out the Jotform Page

            //enterValue enterValue = new enterValue();
            //Enter First and Last Name
            enterValue.enterText(driver, "first_3", "Gerson");
            enterValue.enterText(driver, "last_3", "Pereira");

            //dropdownValue dropdownValue = new dropdownValue();
            //Select D.O.B
            dropdownValue.selectValueFromDropdown(driver, "input_4_month", "January");
            dropdownValue.selectValueFromDropdown(driver, "input_4_day", "22");
            dropdownValue.selectValueFromDropdown(driver, "input_4_year", "2000");

            //Select Instrument
            dropdownValue.selectValueFromDropdown(driver, "input_5", "Bass");

            //checkboxValue checkboxValue = new checkboxValue();
            //Click and choose days of week
            checkboxValue.clickCheckbox(driver, "input_6_0");
            checkboxValue.clickCheckbox(driver, "input_6_1");
            checkboxValue.clickCheckbox(driver, "input_6_3");
            checkboxValue.clickCheckbox(driver, "input_6_4");
            checkboxValue.clickCheckbox(driver, "input_6_6");

            //scrollTo scrollTo = new scrollTo();
            //Scroll to the element box and enter comment
            scrollTo.scrollToElement(driver, "input_8");
            enterValue.enterText(driver, "input_8", "Commenting for Better Utilisation of comment Box");
    }
}
