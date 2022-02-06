package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pages.Twitterpage;
import utilities.Driver;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Twitter {
    Twitterpage page=new Twitterpage();
   static String dlkur="";
    static String eurokur="";


    @Given("benutzer geht {string} internet seite")
    public void benutzer_geht_internet_seite(String string) {
        Driver.getDriver().get(string);
        Driver.wait(2);
        //Driver.getDriver().switchTo().alert().dismiss();
        page.izinver.click();
    }

    @Given("benutzer bekommt dollar preis")
    public void benutzer_bekommt_dollar_preis()  {
       dlkur=page.dolarKur.getText();
        System.out.println(dlkur);
    }

    @Then("benutzer bekommt euro preis")
    public void benutzer_bekommt_euro_preis() {
        eurokur=page.euroKur.getText();
        System.out.println(eurokur);
    }

    @Given("benutzer geht {string} twitter internet seite")
    public void benutzer_geht_twitter_internet_seite(String string) {
        Driver.getDriver().get(string);
        Driver.wait(3);
    }

    @Given("benutzer sendet benutzername {string}")
    public void benutzer_sendet_benutzername(String string) {
        Driver.wait(2);
        page.username.sendKeys(string);

    }

    @Given("benutzer drückt weiterButton")
    public void benutzer_drückt_weiterButton() {
        page.weiterButton.click();
        Driver.wait(3);
    }

    @Given("benutzer sendet passwort {string}")
    public void benutzer_sendet_passwort(String string) {
        page.passwort.sendKeys(string);
    }

    @Given("benutzer drückt anmeldenButton")
    public void benutzer_drückt_anmeldenButton() {
        page.anmeldenButton.click();
        Driver.wait(2);
    }

    @Given("benutzer schreibt dollar und euro")
    public void benutzer_schreibt_dollar_und_euro() {
        LocalDate time= LocalDate.now();
        LocalTime saat=LocalTime.now();
        page.schriftArea.sendKeys("Dolar kuru="+dlkur+"\n"+"Euro kuru="+eurokur+"\n"+time+"\n"+saat);
        Driver.wait(2);
    }

    @Then("benutzer drückt twitButton")
    public void benutzer_drückt_twitButton() throws IOException {
        page.twitButton.click();
        Driver.screenSchot1();
    }

}
