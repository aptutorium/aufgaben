import java.util.Scanner;

class Alter {

  public static void main(String[] args) {
      int alter;
      Scanner myScanner = new Scanner(System.in);

      System.out.println("Bitte geben Sie ihr alter ein: ");
      alter = myScanner.nextInt();

      if (alter >= 18) {
          System.out.println("Sie sind volljährig!");
      } else {
          System.out.println("Sie sind noch nicht volljährig!");
      }

  }

}
