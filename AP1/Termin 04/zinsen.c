#include <stdio.h>
   
int main()
{
	double einlage, zinssatz = 1.03;
	int i, jahre;
	
	printf("Bitte geben Sie Ihre Einlage ein: ");
	scanf("%lf", &einlage);

	printf("Bitte geben Sie die Anzahl der Jahre ein: ");
	scanf("%d", &jahre);


	for (i = 0; i < jahre; i++) {
		einlage = einlage * zinssatz;
	}

	printf("\nIhre Einlage beträgt nach %i Jahren %.2lf Euro\n", jahre, einlage);
	return 0;
}
