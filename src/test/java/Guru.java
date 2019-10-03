import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class Guru {
    @Test
    public void prueba() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");

        Thread.sleep(5000);

        WebElement radioButton = driver.findElement(By.cssSelector("[id='vfb-7-1']"));
        radioButton.click();

        Assert.assertTrue(radioButton.isSelected());

        Thread.sleep(3000);

        WebElement radioButton2 = driver.findElement(By.cssSelector("[id='vfb-7-3']"));
        radioButton2.click();

        WebElement checkbox = driver.findElement(By.cssSelector("[id ='vfb-6-0']"));
        checkbox.click();

        Assert.assertTrue(checkbox.isSelected());

        List<WebElement> nombres = driver.findElements(By.cssSelector("strong"));
        WebElement nombre = nombres.get(1);

        Assert.assertEquals(nombre.getText(), "Checkbox" );


    }


}
