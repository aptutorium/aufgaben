#include <stdio.h>

int main()
{
	int alter, dienstjahre, praemie, zulage = 0;

	printf("Bitte geben sie Ihr Alter ein: ");
	scanf("%d", &alter);
	
	printf("Bitte geben sie Ihr Dienstalter ein: ");
	scanf("%d", &dienstjahre);

	/* Ist die Person schon mindestens 1 Jahr lang beschäftigt? */
	if(dienstjahre >= 1) { 
		praemie = 600;

		/* Ist die Person schon mindestens 6 Jahre lang beschäftigt? */
		if(dienstjahre >= 6) {
		
			/* Ist die Person schon älter als 50? */
			if(alter > 50) { 
				zulage = 250;
			}

			/* Berechnung der Prämie + Zulage */
			praemie = 250 + (75 * dienstjahre) + zulage;
		}
		printf("\nSie erhalten eine Prämie Über %d Euro\n", praemie);	
	}
	/* Die Person ist noch nicht 1 Jahr lang beschäftigt*/
	else {
		printf("\nSie erhalten keine Prämie!\n");
	}

	return 0;
}
