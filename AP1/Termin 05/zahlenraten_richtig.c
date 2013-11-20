#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main ()
{
	int eingabe = 0;
	
	// Zufaellige Zahl zwischen 0 - 9 generieren
	srand(time(NULL));
	const int zufallsZahl = rand() % 10;
	
	do {
		printf("\nWelche Zahl ist gesucht? ");
		scanf("%d", &eingabe);
	
		if (eingabe > zufallsZahl) {
			printf("Die gesuchte Zahl ist kleiner!\n");
		} else if (eingabe < zufallsZahl) {
			printf("Die gesuchte Zahl ist groesser!\n");
		}
		
	} while (eingabe != zufallsZahl);
	
	printf("\nRichtig! Die gesuchte Zahl ist: %d\n", zufallsZahl);
	
	return 0;
}