# Termin 9

## Umgang mit Zeigern

__Vorgegebenes Programmstück:__

     int zahl;
     int* a;
     int** b;
     zahl = 10;
     a = &zahl;
     b = &a;

__Es soll nun zu jeder Frage die passende printf-Anweisung geschrieben werden:__

  1. Welchen Wert hat zahl?
  2. Welche Adresse hat zahl?
  3. Welchen Wert hat a?
  4. Welchen Wert hat zahl unter Verwendung von a?
  5. Welchen Wert hat zahl unter Verwendung von b?
  6. Welchen Wert hat a unter Verwendung von b?

__Die korrekte Ausgabe lautet:__

    Den Wert von zahl: 10
    Die Adresse von zahl: 0x7fff6ce77734
    Welchen Wert hat a: 0x7fff6ce77734
    Den Wert von zahl unter der Verwendung von a: 10
    Den Wert von zahl unter der Verwendung von b: 10
    Den Wert von a unter Verwendung von b: 0x7fff6ce77734

## Zahlentausch über eine Funktion

__Gegeben ist folgendes C-Programm:__

    #include <stdio.h>

    int main()
    {
      int x = 100, y = 50, tmp;

      printf("\nWert in x: %d\n", x);
      printf("Wert in y: %d\n", y);

      printf("\n------ Tausch ------\n\n");

      tmp = x;
      x = y;
      y = tmp;

      printf("Wert in x: %d\n", x);
      printf("Wert in y: %d\n\n", y);

      return 0;
    }

__Ausgabe:__

    Wert in x: 100
    Wert in y: 50

    ------ Tausch ------

    Wert in x: 50
    Wert in y: 100

__Aufgabe:__

Schreiben Sie das Programm so um, dass der Dreieckstausch in eine `Funktion ausgelagert` wird, die Ausgabe aber gleich bleibt. Es soll zudem erläutert werden, warum an dieser Stelle nicht mit `call by value` gearbeitet werden kann.
