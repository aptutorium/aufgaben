#include <stdio.h>

int main() {

	int auswahl;
	double betrag, ergebnis;

	printf("Gewuenschte Umrechnung? \n\n\t1. Euro->Dollar \n\t2. Euro->GBP \n\t3. Euro->CHF \n\nAuswahl: ");
	scanf("%i", &auswahl);

	printf("Betrag eingeben: ");
	scanf("%lf", &betrag);

	/* Was steht in der Variable auswahl? */
	switch (auswahl){

		/* Steht in auswahl eine 1? */
		case 1:
				ergebnis = betrag * 1.38;
				printf("%.2lf Euro sind %.2lf Dollar\n", betrag, ergebnis);
				break;

		/* Steht in auswahl eine 2? */
		case 2:
				ergebnis = betrag * 0.86;
				printf("%.2lf Euro sind %.2lf Pfund\n", betrag, ergebnis);
				break;

		/* Steht in auswahl eine 3? */
		case 3:
				ergebnis = betrag * 1.24;
				printf("%.2lf Euro sind %.2lf Schweizer Franken\n", betrag, ergebnis);
				break;

		/* Keiner der Faelle trifft zu */
		default: printf("Ungueltige Auswahl!\n");
	}

	return 0;
}
