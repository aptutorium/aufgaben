#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main ()
{
	int eingabe = 0;
	
	// Zufaellige Zahl zwischen 0 - 9 generieren
	srand(time(NULL));
	const int zufallsZahl = rand() % 10;
	
	while (eingabe != zufallsZahl) {
		printf("Welche Zahl ist gesucht? ");
		scanf("%d", &eingabe);
	
		if (eingabe > zufallsZahl) {
			printf("Die gesuchte Zahl ist kleiner!\n");
		} else if (eingabe < zufallsZahl) {
			printf("Die gesuchte Zahl ist groesser!\n");
		}
		
	}
	
	printf("\nRichtig! Die gesuchte Zahl ist: %d\n", zufallsZahl);
	
	return 0;
}