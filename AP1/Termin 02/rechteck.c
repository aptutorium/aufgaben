#include <stdio.h>

int main() {
	double a, b, ergebnis;
	
	printf("Bitte geben Sie die erste Seite an: ");
	scanf("%lf", &a);
	
	printf("Bitte geben Sie die zweite Seite an: ");
	scanf("%lf", &b);
	
	ergebnis = a * b;	
	printf("Die Fläche ist: %.2lf\n", ergebnis);
	
	if (a == b) {
		printf("Es handelt sich um ein Quadrat!");
	}

	return 0;
}