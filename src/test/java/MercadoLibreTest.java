import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class MercadoLibreTest {
    @Test
    public void prueba() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jobs.mercadolibre.com/?locale=es_ES");

        Thread.sleep(5000);

        WebElement testDropDown = driver.findElement(By.cssSelector("[title*=P].dropdown-toggle"));
        testDropDown.click();

        Thread.sleep(5000);

        WebElement dropdown = driver.findElement(By.cssSelector("[title='Venezuela'].menu"));

        dropdown.click();

    }

    @Test
    public void prueba2() throws Exception {
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://jobs.mercadolibre.com/go/Venezuela/7787100/");

        Thread.sleep(5000);

        Select dropdown = new Select(driver2.findElement(By.id("optionsFacetsDD_country")));
        dropdown.selectByValue("BR");

        Select dropdown2 = new Select(driver2.findElement(By.id("optionsFacetsDD_city")));
        dropdown2.selectByValue("Florianópolis");

        Select dropdown3 = new Select(driver2.findElement(By.id("optionsFacetsDD_dept")));
        dropdown3.selectByVisibleText("Producto");

        WebElement searchButton = driver2.findElement(By.cssSelector(".submit-generico"));
        searchButton.click();

    }

}
