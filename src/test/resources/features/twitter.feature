@Twitter
Feature:Twitter

@kur
  Scenario: Geht Site
    Given benutzer geht "https://euro.tlkur.com/" internet seite
    And   benutzer bekommt dollar preis
    Then   benutzer bekommt euro preis


  Scenario: Geht Twitter
    Given benutzer geht "https://twitter.com/i/flow/login" twitter internet seite
    And   benutzer sendet benutzername "Guncel_Kurlar"
    And   benutzer drückt weiterButton
    And   benutzer sendet passwort "Abcd1234."
    And   benutzer drückt anmeldenButton
    And   benutzer schreibt dollar und euro
    Then   benutzer drückt twitButton
