package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MercadoLibreJobsDetailsPage {

    public static void countrySelection(WebDriver driver) {
        Select dropdown = new Select(driver.findElement(By.id("optionsFacetsDD_country")));
        dropdown.selectByValue("BR");
    }

    public static void citySelection(WebDriver driver) {
        Select dropdown = new Select(driver.findElement(By.id("optionsFacetsDD_city")));
        dropdown.selectByValue("Florianópolis");
    }

    public static void departmentSelection(WebDriver driver) {
        Select dropdown = new Select(driver.findElement(By.id("optionsFacetsDD_dept")));
        dropdown.selectByVisibleText("Producto");
    }

    public static void clickSearchButton(WebDriver driver) {
        WebElement searchButton = driver.findElement(By.cssSelector(".submit-generico"));
        searchButton.click();
    }
}
