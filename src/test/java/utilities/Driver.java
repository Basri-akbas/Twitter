package utilities;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
public class Driver {

    private Driver(){ }
    static WebDriver driver;
    public static TakesScreenshot tss=(TakesScreenshot) driver;

    public static WebDriver getDriver(){

        if(driver == null){
            switch (ConfigurationReader.getProperty("browser")){
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments(
                            "--no-sandbox",
                            "--disable-extensions",
                            "--disable-gpu",
                            "--ignore-certificate-errors",
                            "--whitelisted-ips=''",
                            "--disable-dev-shm-usage");
                    WebDriverManager.chromedriver().setup();
                    System.setProperty("webdriver.chrome.whitelistedIps", "");
                    driver = new ChromeDriver(options);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
    public static void closeDriver(){

        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void screenSchot()  {
       try {
           // 2- kaydedecegimiz dosyayi olusturalim
           File tumSayfaSS = new File("target/default-cucumber-reports/tumsayfa.png");
           // 3- bir dosya daha olusturup screenshot objesi ile screenshot'i alalim
           File geciciResim=tss.getScreenshotAs(OutputType.FILE);
           // 4- gecici resmi kaydetmek istedigimiz asil dosyaya copy yapalim
           FileUtils.copyFile(geciciResim,tumSayfaSS);
       }catch (NullPointerException | IOException e){
           System.out.println("Olmadi");
       }

    }

    public static void screenSchot1()  {
        LocalDate  date=LocalDate.now();
        try{
            Thread.sleep(3000);
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(image, "jpg", new File("./target/default-cucumber-reports/"+date+".jpg"));
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

}

