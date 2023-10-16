package formActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkboxValue {
    public static void clickCheckbox(WebDriver driver, String id){
        WebElement checkbox = driver.findElement(By.id(id));
        checkbox.click();
    }
}
