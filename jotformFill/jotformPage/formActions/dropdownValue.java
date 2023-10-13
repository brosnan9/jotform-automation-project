package formActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdownValue {
    public static void selectValueFromDropdown(WebDriver driver, String id, String text){

        //Input Birth Date from dropdown
        WebElement dropdown = driver.findElement(By.id(id));
        Select dropdownOption = new Select(dropdown);
        dropdownOption.selectByValue(text);
    }
}
