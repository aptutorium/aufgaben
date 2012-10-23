#include <stdio.h>

int main()
{
	unsigned int monat;

	printf("Monat eingeben: ");
	scanf("%u", &monat);

	/* Was steht in der Variable monat? */
	switch(monat) {
		/* Alle Monate mit 31 Tagen */
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: printf("Der %u. Monat im Jahr hat 31 Tage!\n", monat);
					break;

		/* Alle Monate mit 30 Tagen */
		case 4:
		case 6:
		case 9:
		case 11: printf("Der %u. Monat im Jahr hat 30 Tage!\n", monat);
					break;
		
		/* Februar mit 28 Tagen */
		case 2:	printf("Der Februar hat 28 Tage!\n"); 
					break;
		
		/* Ungültige Eingabe Abfangen*/
		default: printf("Es existiert kein %u. Monat!\n", monat);
	}

	return 0;
}
