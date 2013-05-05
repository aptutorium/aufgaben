# Termin 4

## Vererbung

### Aufgabe 1
Zeichnen Sie für die folgenden Bestandteile eines Spiels die entsprechende Klassenhierarchie auf:

`Wings` `GameObject` `Enemy` `Magic` `Dragon` `Sorcerer` `MovableGameObject` `Tree` `Simon the Sorcerer`

Sind abstrakte oder finale Klassen in diesem Beispiel sinnvoll?

### Aufgabe 2
Betrachten Sie folgende Klassenhierarchie und die bereits implementierte Klasse `Arzt`. Ergänzen Sie die noch fehlende Implementation von `Chirurg` und `Hausarzt`.

![](class_diagram.png)

    public class Arzt {

      public boolean arbeitetImKrankenhaus;

      public void patientBehandeln() {
        System.out.println("Ich untersuche den Patienten!");
      }

    }

### Aufgabe 3
Beantworten Sie folgende Fragen zur vorherigen Klassenhierarchie:

<table>
    <tr>
        <th>Frage</th>
        <th>Lösung</th>
    </tr>
    <tr>
        <td>1. Wie viele Instanzvariablen hat Chirurg?</td>
        <td></td>
    </tr>
    <tr>
        <td>2. Wie viele Instanzvariablen hat Hausarzt?</td>
        <td></td>
    </tr>
    <tr>
        <td>3. Wie viele Methoden hat Arzt?</td>
        <td></td>
    </tr>
    <tr>
        <td>4. Wie viele Methoden hat Chirurg? </td>
        <td></td>
    </tr>
    <tr>
        <td>5. Wie viele Methoden hat Hausarzt?</td>
        <td></td>
    </tr>
    <tr>
        <td>6. Kann ein Hausarzt patientBehandeln()? </td>
        <td></td>
    </tr>
    <tr>
        <td>7. Kann ein Hausarzt schneiden?</td>
        <td></td>
    </tr>
    <tr>
        <td>8. Kann eine Instanz von Arzt angelegt werden?</td>
        <td></td>
    </tr>
    <tr>
        <td>9. Wie viele Instanzen erzeugt new Hausarzt()?</td>
        <td></td>
    </tr>
</table>

