package come.sathya.test;
import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static come.sathya.test.ConfirmationPage.getAlertBannertext;
import static org.junit.Assert.assertEquals;


public class Test {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver", "/Users/sathya.dhanaraj/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formpage = new FormPage();
        formpage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitforAlertBanner(driver);


        assertEquals("The form was successfully submitted!", getAlertBannertext(driver));

        driver.quit();
    }
}



