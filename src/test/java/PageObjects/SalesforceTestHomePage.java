package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesforceTestHomePage {

    WebDriver driver;

    public SalesforceTestHomePage(WebDriver oneDriver) {
        driver = oneDriver;
    }

    public void clickMoreButton(){
        WebElement moreButton = driver.findElement(By.cssSelector(".slds-p-right_small"));
        moreButton.click();
    }


    public void clickCasesButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".slds-dropdown [data-id='Case'] span.slds-truncate")));
        WebElement casesButton = driver.findElement(By.cssSelector(".slds-dropdown [data-id='Case'] span.slds-truncate"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", casesButton);
        Thread.sleep(5000);
    }
}
