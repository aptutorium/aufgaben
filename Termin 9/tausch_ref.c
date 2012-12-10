#include <stdio.h>

int main()
{
	int x = 100, y = 50, tmp;
	int* a = &x;
	int* b = &y;

	printf("\nWert in x: %d\n", x);
	printf("Wert in y: %d\n", y);

	printf("\n------ Tausch ------\n\n");

	tmp = *a;
	*a = *b;
	*b = tmp;

	printf("Wert in x: %d\n", x);
	printf("Wert in y: %d\n\n", y);

	return 0;
}