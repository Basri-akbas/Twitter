package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Twitterpage {
    public Twitterpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@autocomplete='username']")
    public WebElement username;

    @FindBy(xpath = "(//div[@role='button'])[3]")
    public WebElement weiterButton;

    @FindBy(xpath = "//input[@autocomplete='current-password']")
    public WebElement passwort;

    @FindBy(xpath = "(//div[@role='button'])[3]")
    public WebElement anmeldenButton;

    @FindBy(xpath = "//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
    public WebElement schriftArea;

    @FindBy(xpath = "(//div[@role='button'])[15]")
    public WebElement twitButton;

    @FindBy(xpath = "//span[@id='USDTRY']")
    public WebElement dolarKur;

    @FindBy(xpath = "//span[@id='EURTL_rate']")
    public WebElement euroKur;

    @FindBy(xpath = "//button[@class='fc-button fc-cta-consent fc-primary-button']")
    public WebElement izinver;
}
