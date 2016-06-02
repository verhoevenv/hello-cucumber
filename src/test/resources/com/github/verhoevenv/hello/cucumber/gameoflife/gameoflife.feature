# language: nl

Functionaliteit: Game of Life

  Scenario: Een levende cel met 1 buur sterft door onderpopulatie
    Gegeven Een levende cel
    En hij heeft 1 levende buur
    Als de volgende stap wordt berekend
    Dan sterft de cel

  Scenario: Een levende cel met 5 buren sterft door overpopulatie
    Gegeven Een levende cel
    En hij heeft 5 levende buren
    Als de volgende stap wordt berekend
    Dan sterft de cel

  Scenario: Een levende cel met 3 buren overleeft
    Gegeven Een levende cel
    En hij heeft 3 levende buren
    Als de volgende stap wordt berekend
    Dan overleeft de cel

  Scenario: Een dode cel met 3 buren komt tot leven door reproductie
    Gegeven Een dode cel
    En hij heeft 3 levende buren
    Als de volgende stap wordt berekend
    Dan komt de cel tot leven

  Scenario: Een dode cel met 2 buren blijft dood
    Gegeven Een dode cel
    En hij heeft 2 levende buren
    Als de volgende stap wordt berekend
    Dan blijft de cel dood


  Abstract Scenario: Alle levende cel voorbeelden in tabelformaat
    Gegeven Een levende cel
    En hij heeft <buren> levende buren
    Als de volgende stap wordt berekend
    Dan <resultaat> de cel

    Voorbeelden:
      | buren | resultaat |
      |   0   |  sterft   |
      |   1   |  sterft   |
      |   2   | overleeft |
      |   3   | overleeft |
      |   4   |  sterft   |
      |   5   |  sterft   |
      |   6   |  sterft   |
      |   7   |  sterft   |
      |   8   |  sterft   |
