package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesforceTestLoginPage {


    WebDriver driver;

    public SalesforceTestLoginPage(WebDriver oneDriver) {
        driver = oneDriver;
    }


    public void openBrowser() {
        driver.get("https://na136.lightning.force.com/lightning/page/home");
    }

    public void setloginCredentials() {
        WebElement usernameField = driver.findElement(By.cssSelector("#username"));
        WebElement passwordField = driver.findElement(By.cssSelector("#password"));

        usernameField.sendKeys("alejandratest@oktana.io");
        passwordField.sendKeys("delunoalocho1");
    }

    public SalesforceTestHomePage clickLoginButton() {
        WebElement loginButton = driver.findElement(By.cssSelector("#Login"));
        loginButton.click();
        return new SalesforceTestHomePage(driver);
    }

}
