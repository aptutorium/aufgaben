# Termin 1

## Einführung in die Objektorientierte Programmierung

__Aufgabenstellung:__

Schreiben Sie eine Java Klasse, welche die Eigenschaften von einem Haus verkörpert. Ein Haus soll zunächst zur Vereinfachung durch seine Grundfläche beschrieben werden.

  1. Welche Instanzvariablen werden bis zu diesem Punkt benötigt?
  2. Wie könnte ein sinnvoller Konstruktor aussehen?

Später soll die Klasse so erweitert werden, dass beliebig viele Personen in das Haus einziehen können. Schreiben sie für den Typ `Person` ebenfalls eine eigene Klasse, welche `Vornamen`, `Nachnamen` und `Alter` speichert.

  3. Wie können nun mehrere Objekte vom Typ `Person` innerhalb `Haus` gespeichert werden?

Die fertige Klasse `Person` sollte folgende Methoden aufweisen:

```java
int getAlter()
int setAlter()
```

Die fertige Klasse `Haus` sollte folgende Methoden aufweisen:

```java
double getFlaeche() // Berechnet die Fläche des Hauses
void setPersonen(Person[] person) // Lässt Personen in das Haus einziehen
```

__Zusatzaufgabe:__

Schreiben sie eine Methode, die die älteste Person im Haushalt berechnet.

```java
    Person getAeltestePerson() // Gibt die älteste Person des Haushalts zurück
```

In welcher Klasse sollte diese Methode sinnvollerweise implementiert werden?





