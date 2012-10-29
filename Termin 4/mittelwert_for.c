#include <stdio.h>

int main()
{
	int i;
	double summe = 0, zahl, mw;

	for (i = 0; i < 10; i++)
	{
		printf("Geben Sie einen Wert ein: ");
		scanf("%lf", &zahl);
		summe = summe + zahl;
	}

	mw = summe / 10;

	printf ("\nDie Summe betraegt: %.2lf\n",summe);
	printf ("Der Mittelwert betraegt: %.2lf \n\n",mw);

	return 0;
}
