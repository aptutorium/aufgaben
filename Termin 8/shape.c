#include <stdio.h>

double quadrat(double a) {
	double ergebnis = 0;
	ergebnis = a * a;
	return ergebnis;
}

double rechteck(double a, double b) {
	double ergebnis = 0;
	if (a == b) {
		ergebnis = quadrat(a);
	} else {
		ergebnis = a * b;
	}
	return ergebnis;
}

double kreis(double r) {
	double ergebnis = 0;
	double pi = 3.14;
	ergebnis = pi * r *r;
	return ergebnis;
}

int main() {

	double a = 0, b = 0, r = 0;
	double flaeche;
	int auswahl;
	
	printf("Für welches Objekt soll die Fläche ausgerechnet werden? \n");
	printf("1: Quadrat, 2: Rechteck, 3: Kreis \n");
	scanf("%d", &auswahl);
	
	switch (auswahl) {
		case 1:	printf("Bitte ersten Operand eingeben: ");
				scanf("%lf", &a);
				flaeche = quadrat(a);
				printf("Die Fläche eines Quadrats ist %.2lf", flaeche);
				break;
		case 2: printf("Bitte ersten Operand eingeben: ");
				scanf("%lf", &a);
				printf("Bitte zweiten Operand eingeben: ");
				scanf("%lf", &b);
				flaeche = rechteck(a, b);
				printf("Die Fläche eines Rechtecks ist %.2lf", flaeche);
				break;
		case 3: printf("Bitte Radis eingeben: ");
				scanf("%lf", &r);
				flaeche = kreis(r);
				printf("Die Fläche eines Kreises ist %.2lf", flaeche);
				break;
	}
	return 0;
}