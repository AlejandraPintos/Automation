package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesforceTestCasesPage {

    public static void openFirstCase(WebDriver driver) {
        WebElement primerCaso = driver.findElement(By.cssSelector("[data-recordid*='500']:not(.textUnderline)"));
        primerCaso.click();
    }
}