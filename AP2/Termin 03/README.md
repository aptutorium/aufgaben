# Termin 3

## Interfaces

__Aufgabenstellung:__

Im letzten Tutorium wurde eine generische Klasse `Garage` erstellt. In einer Garage konnte __entweder__ ein `Auto` __oder__ ein `Motorrad` geparkt werden. Es war allerdings nicht möglich, eine Garage zu erstellen, in welcher beide Fahrzeugtypen geparkt werden können. Erstellen Sie ein Interface `Verkehrsmittel`, welches folgende Eigenschaften vorgibt:

  * starteMotor()
  * stoppeMotor()
  * motorLaeuft()
  * anzahlReifen()

Das Interface `Verkehrsmittel` ist nun in den Klassen `Auto` und `Motorrad` zu implementieren. Das starten und stoppen des Motors soll lediglich eine Boolean Variable auf true bzw. false setzen.

  * Welche der Methoden ist für `Auto` und `Motorrad` unterschiedlich zu implementieren?

Versuchen Sie nun das zu Anfang beschriebene Problem mit Hilfe des angelegten Interfaces zu lösen. 

  * Mit welchem Typ muss nun eine Garage angelegt werden?
  * Können Sie in diesem Zusammenhang den Begriff “Polymorphie” erklären?


