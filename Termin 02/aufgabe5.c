#include <stdio.h>

int main()
{
	double anfangskapital;
	double zinssatz;
	double endkapital;

	
	printf("Wie hoch ist die Einlage: ");
	scanf("%lf", &anfangskapital);

	printf("Wie hoch ist der Zinssatz: ");
	scanf("%lf", &zinssatz);

	endkapital = anfangskapital * (1 + zinssatz / 100);

	printf("Das Guthaben betraegt %.2lf Euro\n", endkapital);

	return 0;
}
