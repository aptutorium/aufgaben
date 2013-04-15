# Termin 1

## Einführung in die Objektorientierte Programmierung

__Aufgabenstellung:__

Schreiben Sie eine Java Klasse, welche die Eigenschaften von einem Haus verkörpert. Die Grundfläche des Hauses soll immer die Form eines Rechtecks haben.

  1. Welche Instanzvariablen werden bis zu diesem Punkt benötigt?
  2. Wie könnte ein sinnvoller Konstruktor aussehen?

Später soll die Klasse so erweitert werden, dass beliebig viele Personen in das Haus einziehen können. Schreiben sie für den Typ `Person` ebenfalls eine eigene Klasse, welche `Vornamen`, `Nachnamen` und `Alter` speichert.

  3. Wie können mehrere Objekte vom Typ `Person` innerhalb `Haus` gespeichert werden?

Die fertige Klasse `Person` sollte folgende Methoden aufweisen:

    int getAlter()
    int setAlter()

Die fertige Klasse `Haus` sollte folgende Methoden aufweisen:
    
    double getFlaeche() // Berechnet die Fläche des Hauses
    void setPersonen(Person[] person) // Lässt Personen in das Haus einziehen
    

__Zusatzaufgabe:__

Schreiben sie eine Methode, die die älteste Person im Haushalt berechnet.

    Person getAeltestePerson() // Gibt die älteste Person des Haushalts zurück

In welcher Klasse sollte diese Methode sinnvollerweise implementiert werden?





