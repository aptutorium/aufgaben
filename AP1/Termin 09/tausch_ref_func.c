#include <stdio.h>

void tausch(int* a, int* b);

int main()
{
	int x = 100, y = 50;

	printf("\nWert in x: %d\n", x);
	printf("Wert in y: %d\n", y);

	printf("\n------ Tausch ------\n\n");

	tausch(&x, &y);

	printf("Wert in x: %d\n", x);
	printf("Wert in y: %d\n\n", y);

	return 0;
}

void tausch(int* a, int* b) 
{
	int tmp = *a;
	*a = *b;
	*b = tmp;
}