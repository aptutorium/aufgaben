import java.util.Scanner;

class Mittelwert {

  public static void main(String[] args)
  {
    int i=0, j;
    double summe = 0;
    double mittelwert = 0;
    double werte[] = new double[6];
    Scanner input = new Scanner(System.in);

    System.out.printf("Bitte geben Sie eine Folge von Zahlen ein: \n");

    // Solange Werte einlesen, bis strg + d gedrückt wird
    while (input.hasNext()) {
      if (i>5) {
        System.out.printf("Es duerfen max. 6 Werte eingegeben werden!\n");
        System.exit(1);
      }
      werte[i++] = input.nextDouble();
    }

    System.out.printf("\n\nAnzahl der eingelesenen Werte: %d", i);
    System.out.printf("\nAusgabe der eingelesenen Zahlenfolge\n");

    for (j=0; j<i; j++) {
      System.out.printf("%.2f ", werte[j]);
      summe += werte[j];
    }

    mittelwert = summe / i;
    System.out.printf("\nDer Mittelwert der %d Zahlen ist: %.2f\n\n", i, mittelwert);
  }
}
