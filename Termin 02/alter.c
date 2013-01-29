#include <stdio.h>

int main()
{
	double netto;
	double brutto;
	double mwst = 1.19;

	// Eingabe
	printf("Bitte geben Sie den Preis ein: \n");
	scanf("%lf", &netto);

	// Verarbeitung
	brutto = netto * mwst;

	// Ausgabe
	printf("Der Preis beträgt: %.2f Euro\n", brutto);

	return 0;
}