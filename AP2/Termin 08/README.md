# Termin 8

## Suchalgorithmen

### Aufgabe 1
Schreiben Sie eine lineare Suche für ein Array mit `PlayingCards`. Das Array ist bereits vorgegeben. Es soll lediglich der Sortieralgorithmus mit folgender Signatur geschrieben werden:

    public static int linearSearch(PlayingCard[] cards, PlayingCard key) {...}

Der Rückgabewert der Methode ist der Index der gefundenen Karte im Array. Konnte die Karte nicht gefunden werden, so soll -1 zurückgegeben werden. Welche Laufzeit hat dieser Algorithmus?

### Aufgabe 2
Schreiben Sie nun eine Binäre Suche, die für den internen Vergleich der Objekte einen Comparator verwendet. Die Signatur der Methode soll wie Folgt aussehen:

    public static int binarySearch(Object[] array, Object key, Comparator cmp) {
      int anfang = ???;
      int ende = ???;
      int mitte = ???;
      
      while (???) {
          /* Prüfen welcher Bereich als nächses durchsucht werden soll 
           und neue Grenzen bestimmen */
          ???
          // Neue Mitte berechnen
          mitte = ???;
      }

      return ???
    }

Der Rückgabewert der Methode ist der Index des gefundenen Objekts im Array. Konnte das Objekt nicht gefunden werden, so soll –1 zurückgegeben werden. Welche Laufzeit hat dieser Algorithmus?
