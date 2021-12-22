package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Page001;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class Klass001 {
    Page001 page=new Page001();

    @Given("benutzer geht {string} Seite")
    public void benutzer_geht_Seite(String string) {
        Driver.getDriver().get(string);
        page.cookies.click();
    }

    @Given("benutzer gibt bereich des Wie viel {string} ein")
    public void benutzer_gibt_bereich_des_Wie_viel_ein(String string) {
        Actions action=new Actions(Driver.getDriver());
        action.doubleClick(page.Wieviel).perform();
        page.Wieviel.sendKeys(string);
    }

    @Given("benutzer gibt bereich des Wie lange {string} ein")
    public void benutzer_gibt_bereich_des_Wie_lange_ein(String string) {
        page.wielange.click();Driver.wait(3);
        page.Monat.click();
    }

    @Given("benutzer gibt bereich des Wofür {string} ein")
    public void benutzer_gibt_bereich_des_Wofür_ein(String string) {
        page.wofür.click();
        Driver.wait(3);
        page.neufahr.click();
    }

    @Given("benutzer auswahlt in Sortieren {string}")
    public void benutzer_auswahlt_in_Sortieren(String string) {
        page.sortieren.click();
        page.secimsort.click();
        Driver.wait(3);
        for (WebElement w: page.reinFolge1) {
            System.out.println(w.getText());
        }
    }

    @Then("benutzer assert Prozedur")
    public void benutzer_assert_Prozedur() {
        Assert.assertEquals(ConfigurationReader.getProperty("value"),page.reinFolge1.get(0).getText());
    }
}
