import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SalesforceTest {
    @Test
    public void prueba1() throws Exception{

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://na136.lightning.force.com/lightning/page/home");
        WebElement usernameField = driver1.findElement(By.cssSelector("#username"));
        WebElement passwordField = driver1.findElement(By.cssSelector("#password"));
        String user = "alejandratest@oktana.io";
        String pass = "delunoalocho1";

        usernameField.sendKeys(user);
        passwordField.sendKeys(pass);

        WebElement loginButton = driver1.findElement(By.cssSelector("#Login"));
        loginButton.click();

        Thread.sleep(10000);

        WebElement moreButton = driver1.findElement(By.cssSelector(".slds-p-right_small"));
        moreButton.click();

        WebDriverWait wait = new WebDriverWait(driver1, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".slds-dropdown [data-id='Case'] span.slds-truncate")));

        WebElement casesButton = driver1.findElement(By.cssSelector(".slds-dropdown [data-id='Case'] span.slds-truncate"));
        JavascriptExecutor executor = (JavascriptExecutor)driver1;

        executor.executeScript("arguments[0].click();", casesButton);

        String Pathx = "outputLookupLink";

        Thread.sleep(5000);

        WebElement primerCaso = driver1.findElement(By.cssSelector("[data-recordid*='500']:not(.textUnderline)"));

        primerCaso.click();

        List<WebElement> prueba = driver1.findElements(By.className("ale"));
        int total = prueba.size();
        Assert.assertEquals(total,0);


    }
}
