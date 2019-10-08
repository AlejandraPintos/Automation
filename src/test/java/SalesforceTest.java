import PageObjects.SalesforceTestCasesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import PageObjects.SalesforceTestLoginPage;
import PageObjects.SalesforceTestHomePage;


public class SalesforceTest {
    @Test
    public void prueba() throws Exception{

        WebDriver driver = new ChromeDriver();

        SalesforceTestLoginPage loginPage = new SalesforceTestLoginPage(driver);

        loginPage.openBrowser();

        loginPage.setloginCredentials();

        SalesforceTestHomePage homePage = loginPage.clickLoginButton();

        Thread.sleep(10000);

        homePage.clickMoreButton();

        homePage.clickCasesButton();

       // homePage.openFirstCase();

    }
}
