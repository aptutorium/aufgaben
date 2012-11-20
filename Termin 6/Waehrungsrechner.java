import java.util.Scanner;

class Waehrungsrechner {

  public static void main(String[] args) {
    int auswahl;
    double betrag, ergebnis;

    // Neuen Scanner anlegen
    Scanner myScanner = new Scanner(System.in);

    System.out.printf("Gewuenschte Umrechnung? \n\n\t1. Euro->Dollar \n\t2. Euro->GBP \n\nAuswahl: ");
    auswahl = myScanner.nextInt();

    System.out.println("Betrag eingeben: ");
    betrag = myScanner.nextDouble();

    /* Wurde eine 1 eingegeben? */
    if(auswahl == 1) {
      ergebnis = betrag * 1.38;
      System.out.printf("%.2f Euro sind %.2f Dollar\n", betrag, ergebnis);
    }
    /* Wurde eine 2 eingegeben? */
    else if(auswahl == 2) {
      ergebnis = betrag * 0.86;
      System.out.printf("%.2f Euro sind %.2f Pfund\n", betrag, ergebnis);
    }
    /* Keiner der Faelle trifft zu */
    else {
      System.out.println("Ungueltige Auswahl!");
    }
  }

}
