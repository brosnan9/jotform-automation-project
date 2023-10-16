package formActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scrollTo {
    public static void scrollToElement(WebDriver driver, String id){
        //Scroll to the Comment Element
        WebElement comment = driver.findElement(By.id(id));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", comment);
        //comment.click();
    }
}
