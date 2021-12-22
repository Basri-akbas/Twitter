package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Page001 {
    public Page001(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/app-root/app-initial/div/div[3]/div/div/div/app-comparison/app-calculator/div/div[1]/div[1]/input")
    public WebElement Wieviel;

    @FindBy (xpath = "(//div[@class='selectedOption'])[1]")
    public WebElement wielange;

    @FindBy(xpath = "(//div[@class='selectedOption'])[2]")
    public WebElement wofür;

    @FindBy(xpath = "//div[@class='openFilter ng-tns-c28-1']")
    public WebElement filtern;

    @FindBy(xpath = "//*[contains(text(),' Sortieren ')]")
    public WebElement sortieren;

    @FindBy(xpath = "//button[contains(text(),' weiter ')]")
    public WebElement weiter;

    @FindBy(xpath = "(//a[@class='c24-cookie-consent-button'])[1]")
    public WebElement cookies;

    @FindBy(xpath="(//li[@class='ng-star-inserted'])[2]")
    public WebElement Monat;

    @FindBy(xpath="//*[contains(text(),' Neufahrzeug ')]")
    public WebElement neufahr;

    @FindBy(xpath = "(//p[@class='ng-tns-c28-1'])[2]")
    public WebElement secimsort;

    @FindBy(xpath = "//b[@class='effInterest blue ng-tns-c51-0 redAttack']")
    public List<WebElement> reinFolge1;

    @FindBy(xpath = "//div[@class='effInterestContainer ng-tns-c51-0']")
    public List<WebElement> reinFolge;


}
