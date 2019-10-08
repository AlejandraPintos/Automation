import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import PageObjects.GuruPage;



public class Guru {
    @Test
    public void prueba() throws Exception {

        WebDriver driver = new ChromeDriver();

        GuruPage.openGuru(driver);

        Thread.sleep(3000);

        GuruPage.selectRadioButton(driver);

        Thread.sleep(1000);

        GuruPage.selectCheckbox(driver);

        Thread.sleep(1000);

        driver.quit();

    }







}
