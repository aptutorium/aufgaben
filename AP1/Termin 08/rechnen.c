#include <stdio.h>

int addiere(int a, int b);

int main() {

	int zahl1 = 0;
	int zahl2 = 0;
	int ergebnis = 0;
	
	printf("Bitte erste Zahl eingeben: ");
	scanf("%d", &zahl1);
	
	printf("Bitte zweite Zahl eingeben: ");
	scanf("%d", &zahl2);
	
	ergebnis = addiere(zahl1, zahl2);
	
	printf("Das Ergebnis ist: %d", ergebnis);
	return 0;
}

int addiere(int a, int b) {
	int summe = 0;
	summe = a + b;
	return summe;
}