import java.util.Scanner;

public class Array {

  public static void main ( String [] args )
  {

    Scanner in = new Scanner(System.in);

    int[] zahl = new int[5];

    // Einlesen der Zahlen
    for(int i=0; i<=4; i++) {
      System.out.printf("Bitte geben Sie eine Zahl ein: ");
      zahl[i]=in.nextInt();
    }

    // Ausgabe der Zahlen vorwärts
    System.out.printf("\nVorwärts: ");

    for(int i=0; i<=4; i++) {
      System.out.printf(zahl[i] + " ");
    }

    // Ausgabe der Zahlen rückwärts
    System.out.printf("\nRückwärts: ");

    for(int i=4; i>=0; i--) {
      System.out.printf(zahl[i] + " ");
    }

  }
}
