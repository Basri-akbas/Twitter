Feature:Check24

@Check24
  Scenario:Kredit Vergleich
    Given benutzer geht "https://kredit.check24.de/vergleich" Seite
    And   benutzer gibt bereich des Wie viel "15000" ein
    And   benutzer gibt bereich des Wie lange "48 Monate" ein
    And   benutzer gibt bereich des Wofür "Neufahrzeug" ein
    And   benutzer auswahlt in Sortieren "beste Bewertung"
    Then  benutzer assert Prozedur

