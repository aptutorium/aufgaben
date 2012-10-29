#include <stdio.h>

int main()
{
	int i = 0;
	double summe = 0, zahl, mittelwert;

	while(i < 10)
	{
		printf("Geben Sie einen Wert ein: ");
		scanf("%lf", &zahl);
		summe = summe + zahl;
		i++;
	}

	mittelwert = summe / 10;

	printf ("\nDie Summe betraegt: %.2lf\n",summe);
	printf ("Der Mittelwert betraegt: %.2lf \n\n",mittelwert);

	return 0;
}

