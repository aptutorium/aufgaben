# Termin 6

## Comparator und Einführung in Sortieralgorithmen

### Aufgabe 1 (Aus Probeklausur)
Schreiben Sie eine Klasse StringLengthComparator, die die Schnittstelle Comparator implementiert und für sich festlegt, dass ein längerer String als größer als ein kürzerer String betrachtet wird.

    ArrayList<String> meinSatz = new ArrayList<String>();
    meinSatz.add("ein")
    meinSatz.add("kurzer")
    meinSatz.add("test")

    Collections.sort(meinSatz, stringComparator);
    System.out.println(meinSatz);

    >> ["ein", "test", "kurzer"]

### Aufgabe 2
Führen Sie die Aufzeichnung der im Tutorium gezeigten Sortieralgorithmen `SelectionSort` und `InsertionSort` fort. Versuchen sie dabei alle notwendigen Schritte (Vergleiche, Variablen, etc.) schriftlich festzuhalten. Es soll zunächst kein Quellcode geschrieben werden!

__Zusatzaufgabe:__

Versuchen Sie eine konkrete Implementierung beider Sortieralgorithmen zu schreiben.

