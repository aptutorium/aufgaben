#include <stdio.h>

int main()
{
	int zahl;
	int* a;
	int** b;

	zahl = 10;
	a = &zahl;
	b = &a;

	printf("\nDen Wert von zahl: %d", zahl);
	printf("\nDie Adresse von zahl: %p", &zahl);
	printf("\nAuf welchen Wert zeigt a: %d", *a);
	printf("\nWelchen Wert hat a: %p", a);
	printf("\nDen Wert von zahl unter der Verwendung von a: %d", *a);
	printf("\nDen Wert von zahl unter der Verwendung von b: %d", **b);
	printf("\nDen Wert von a unter Verwendung von b: %p\n\n", *b);

	return 0;
}