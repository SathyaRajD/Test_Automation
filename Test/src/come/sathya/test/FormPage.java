package come.sathya.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public static void submitForm(WebDriver driver) {

        driver.findElement(By.id("first-name")).sendKeys("Sathya");

        driver.findElement(By.id("last-name")).sendKeys("Raj D");

        driver.findElement(By.id("job-title")).sendKeys("Test Engineer");

        driver.findElement(By.id("radio-button-3")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='3']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("03/03/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
