import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;




public class Autocomplete {

    WebDriver driver;
    WebDriverWait wait;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;


    public static void main(String[] args) throws IOException {


        System.setProperty("webdriver.chrome.driver", "/Users/sathya.dhanaraj/Downloads/chromedriver_win32 (1)/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://wfm-uat.ptw.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Import excel sheet.
        File src = new File("C:/Users/sathya.dhanaraj/Downloads/Credentials.xlsx");

        // Load the file.
        FileInputStream finput = new FileInputStream(src);

        // Load the workbook.
        XSSFWorkbook workbook = new XSSFWorkbook(finput);

        // Load the sheet in which data is stored.
        XSSFSheet sheet = workbook.getSheet("Password");

        XSSFRow row1=sheet.getRow(1);

        XSSFCell cell = sheet.getRow(1).getCell(0);

        String address= cell.getStringCellValue();

        XSSFCell cell1 = sheet.getRow(1).getCell(1);

        String address2= cell1.getStringCellValue();


                WebElement name = driver.findElement(By.id("loginForm:username"));
                name.click();
                name.sendKeys(address.toString());

                WebElement password1 = driver.findElement(By.id("loginForm:password"));
                password1.click();
                password1.sendKeys(address2.toString());


                WebElement button = driver.findElement(By.id("loginForm:submitButton"));
                button.click();

                //isDisplayed() method returns boolean value either True or False
                Boolean Display = driver.findElement(By.id("sidenav-ess-joyride")).isDisplayed();

                if (Display==Boolean.TRUE) {


                    //Take the screenshot

                    File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(f, new File("C:/Users/sathya.dhanaraj/Desktop/Sucessful.png"));


                    WebElement buttoness = driver.findElement(By.id("sidenav-ess-joyride"));
                    buttoness.click();

                    WebElement AandS = driver.findElement(By.className("ess-department-joyride-link"));
                    AandS.click();

                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

                    WebElement checkin = driver.findElement(By.cssSelector("#root > div > div > div.main-content.move > div.awl-custom-tabs.attendance-shift-tabs > div > div > div.my-0.m-0.row > div.pl-0.col-md-7 > div.row-items.timesheet > button"));
                    checkin.click();


                    driver.quit();
                }
                else
                {
            driver.quit();
        }

        System.setProperty("webdriver.chrome.driver", "/Users/sathya.dhanaraj/Downloads/chromedriver_win32 (1)/chromedriver.exe");

        ChromeOptions options1 = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver1 = new ChromeDriver(options);

        driver1.get("https://wfm-uat.ptw.com/");

        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Import excel sheet.
        File src1 = new File("C:/Users/sathya.dhanaraj/Downloads/Credentials.xlsx");

        // Load the file.
        FileInputStream finput1 = new FileInputStream(src1);

        // Load the workbook.
        XSSFWorkbook workbook1 = new XSSFWorkbook(finput1);

        // Load the sheet in which data is stored.
        sheet = workbook1.getSheet("Password");

        XSSFRow row2 = sheet.getRow(2);

        XSSFCell cell2 = sheet.getRow(2).getCell(0);

        String address3= cell2.getStringCellValue();

        XSSFCell cell3 = sheet.getRow(2).getCell(1);

        String address4= cell3.getStringCellValue();


        WebElement name1 = driver1.findElement(By.id("loginForm:username"));
        name1.click();
        name1.sendKeys(address3.toString());

        WebElement password2 = driver1.findElement(By.id("loginForm:password"));
        password2.click();
        password2.sendKeys(address4.toString());


        WebElement button1 = driver1.findElement(By.id("loginForm:submitButton"));
        button1.click();

        //isDisplayed() method returns boolean value either True or False
        Boolean Display1 = driver1.findElement(By.xpath("//*[@id=\"authArea\"]/div[2]/ul/li")).isDisplayed();

        if (Display1==Boolean.TRUE) {


            //Take the screenshot

            File f = ((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(f, new File("C:/Users/sathya.dhanaraj/Desktop/Failed.png"));

            driver1.quit();
        } else {
            driver1.quit();
        }



    }


        }







