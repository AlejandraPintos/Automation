package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class GuruPage {


    public static void openGuru(WebDriver driver) {
        driver.get("http://demo.guru99.com/test/radio.html");
    }

    public static void selectRadioButton(WebDriver driver) {
        WebElement radioButton = driver.findElement(By.cssSelector("[id='vfb-7-3']"));
        radioButton.click();
        Assert.assertTrue(radioButton.isSelected());
    }

    public static void selectCheckbox(WebDriver driver) {
        WebElement nombre = driver.findElement(By.cssSelector("[id='vfb-6-0']"));
        nombre.click();
    }

}
