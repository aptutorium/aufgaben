# Termin 10

## Umgang mit Zeichenketten

__Vorgegebener Programmcode:__

    #include <stdio.h>

    int countchar(char word[]);
    void print(char word[], int size);
    void reverse(char word[], int size);

    int main()
    {
      char word[10];

      printf("Bitte geben Sie ein Wort ein: ");
      scanf("%s", word);

      printf("In umgedrehter Reihenfolge: ");
      reverse(word, countchar(word));
      printf("\n");

      return 0;
    }

__Aufgabenstellung:__

a) Schreiben Sie die Funktion countchar(char word[]), welche die Anzahl der Buchstaben des übergebenen Wortes zählt und an das Hauptprogramm zurückliefert.

b) Schreiben Sie die Funktion print(char word[], int size), welche das übergebene Wort ausgibt.

c) Ändern Sie ihr Programm so ab, dass der Benutzer eine Auswahl zwischen normaler und umgedrehter Ausgabe hat. Definieren Sie hierfür die Funktion reverse(char word[], int size).

## Sortiertes Array

__Vorgegebener Programmcode:__

    #include <stdio.h>

    void einlesen(int array[], int groesse);
    void ausgabe(int array[], int groesse);
    void sortieren(int array[], int groesse);

    int main()
    {
        const int groesse = 5;
        int array[groesse];

        printf("Bitte geben Sie 5 Zahlen ein! \n");
        einlesen(array, groesse);
        printf("\nUnsortiertes Array: \n");
        ausgabe(array, groesse);

        printf("\nSortiertes Array: \n");
        sortieren(array, groesse);
        ausgabe(array, groesse);

        return 0;
    }
