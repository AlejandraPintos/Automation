package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MercadoLibreJobsPage {

    public static void openPage(WebDriver driver) {
        driver.get("https://jobs.mercadolibre.com/?locale=es_ES");
    }

    public static void clickOnCountryMenu(WebDriver driver) {
        WebElement testDropDown = driver.findElement(By.cssSelector("[title*=P].dropdown-toggle"));
        testDropDown.click();
    }

    public static void selectCountry(WebDriver driver) {
        WebElement dropdown = driver.findElement(By.cssSelector("[title='Venezuela'].menu"));
        dropdown.click();
    }

}
