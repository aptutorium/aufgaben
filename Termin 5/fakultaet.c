#include <stdio.h>

int main(int argc, char const *argv[])
{
	unsigned int val;
	int fak = 1, i;

	printf("Bitte geben Sie eine Zahl ein: ");
	scanf("%u", &val);

	for (i = 1; i <= val; ++i)
	{
		printf("%d", i);
		if(i != val) {
			printf(" * ");
		} 
		else {
			printf(" = ");
		}
		fak *= i;
	}

	printf("%d\n", fak);
	
	return 0;
}