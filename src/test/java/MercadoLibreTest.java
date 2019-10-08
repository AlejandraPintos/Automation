import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import PageObjects.MercadoLibreJobsPage;
import PageObjects.MercadoLibreJobsDetailsPage;



public class MercadoLibreTest {
    @Test
    public void prueba() throws Exception {

        WebDriver driver = new ChromeDriver();

        MercadoLibreJobsPage.openPage(driver);

        Thread.sleep(5000);

        MercadoLibreJobsPage.clickOnCountryMenu(driver);

        Thread.sleep(4000);

        MercadoLibreJobsPage.selectCountry(driver);

        Thread.sleep(3000);

        MercadoLibreJobsDetailsPage.countrySelection(driver);

        MercadoLibreJobsDetailsPage.citySelection(driver);

        MercadoLibreJobsDetailsPage.departmentSelection(driver);

        MercadoLibreJobsDetailsPage.clickSearchButton(driver);

        Thread.sleep(2000);

        driver.quit();
    }

}
