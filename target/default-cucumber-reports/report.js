$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/twitter.feature");
formatter.feature({
  "name": "Twitter",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Twitter"
    }
  ]
});
formatter.scenario({
  "name": "Geht Site",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Twitter"
    },
    {
      "name": "@kur"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "benutzer geht \"https://euro.tlkur.com/\" internet seite",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Twitter.benutzer_geht_internet_seite(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "benutzer bekommt dollar preis",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Twitter.benutzer_bekommt_dollar_preis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "benutzer bekommt euro preis",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Twitter.benutzer_bekommt_euro_preis()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Geht Twitter",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Twitter"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "benutzer geht \"https://twitter.com/i/flow/login\" twitter internet seite",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Twitter.benutzer_geht_twitter_internet_seite(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "benutzer sendet benutzername \"Guncel_Kurlar\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Twitter.benutzer_sendet_benutzername(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "benutzer drückt weiterButton",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Twitter.benutzer_drückt_weiterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "benutzer sendet passwort \"Abcd1234.\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Twitter.benutzer_sendet_passwort(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "benutzer drückt anmeldenButton",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Twitter.benutzer_drückt_anmeldenButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "benutzer schreibt dollar und euro",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Twitter.benutzer_schreibt_dollar_und_euro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "benutzer drückt twitButton",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Twitter.benutzer_drückt_twitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});