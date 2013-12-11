#include <stdio.h>

int main()
{
	int i=0, j;
	double werte[6], zahl, summe, mittelwert;

	printf("Bitte geben Sie eine Folge von Zahlen ein: \n");

	// Solange Werte einlesen, bis strg + d gedrückt wird
	while ((scanf("%lf", &zahl)) != EOF) {
		if (i>5) {
			printf("Es duerfen max. 6 Werte eingegeben werden!\n");
			return -1;
		}
		werte[i++] = zahl;
	}

	printf("\n\nAnzahl der eingelesenen Werte: %d", i);
	printf("\nAusgabe der eingelesenen Zahlenfolge\n");

	for (j=0; j<i; j++) {
		printf("%.2lf ", werte[j]);
		summe += werte[j];
	}

	mittelwert = summe / i;
	printf("\nDer Mittelwert der %d Zahlen ist: %.2lf\n\n", i, mittelwert);
}
