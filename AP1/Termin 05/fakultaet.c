#include <stdio.h>

int main(void)
{
	unsigned int val;
	int fakultaet = 1, i;

	printf("Bitte geben Sie eine Zahl ein: ");
	scanf("%u", &val);

	for (i = 1; i <= val; i++)
	{
		printf("%d", i);

		i != val ? printf(" * ") : printf(" = ");

		fakultaet *= i;
	}

	printf("%d\n", fakultaet);

	return 0;
}
