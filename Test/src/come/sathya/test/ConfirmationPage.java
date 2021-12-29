package come.sathya.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

    public static void waitforAlertBanner(WebDriver driver){

    WebDriverWait wait = new WebDriverWait(driver,1000);
    WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

}

    public static Object getAlertBannertext(WebDriver driver){
         return driver.findElement(By.className("alert")).getText();
    }
}
