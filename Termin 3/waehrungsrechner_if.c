#include <stdio.h>

int main() {
	
	int auswahl;
	double betrag, ergebnis;
	
	printf("Gewuenschte Umrechnung? \n\n\t1. Euro->Dollar \n\t2. Euro->GBP \n\nAuswahl: ");
	scanf("%i", &auswahl);

	printf("Betrag eingeben: ");
	scanf("%lf", &betrag);
	
	/* Wurde eine 1 eingegeben? */
	if(auswahl == 1) {
		ergebnis = betrag * 1.38;
		printf("%.2lf Euro sind %.2lf Dollar\n", betrag, ergebnis);
	} 
	/* Wurde eine 2 eingegeben? */
	else if(auswahl == 2) {
		ergebnis = betrag * 0.86;
		printf("%.2lf Euro sind %.2lf Pfund\n", betrag, ergebnis);
	}
	/* Keiner der Faelle trifft zu */
	else {
		printf("Ungueltige Auswahl!\n");
	}
	
	return 0;
}
