package formActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class enterValue {
    public static void enterText(WebDriver driver, String id, String text){

        WebElement value = driver.findElement(By.id(id));
        value.sendKeys(text);
    }
}
