#include <stdio.h>

int main () {
	
	printf("For-Schleife\n");
	for(int i = 0; i < 10; i++) {
		printf("Durchlauf Nummer: %d\n", i);
	}
	
	printf("While-Schleife\n");
	int j = 0;
	while (j < 10) {
		printf("Durchlauf Nummer: %d\n", j);
		j++;
	}
	
	return 0;
}