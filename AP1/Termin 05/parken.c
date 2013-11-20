#include <stdio.h>

int main(int argc, const char *argv[])
{
	int gebuehr = 200, einwurf;
	
	while(gebuehr != 0) {
		printf("Bitte Werfen Sie eine Muenze ein: ");
		scanf("%d", &einwurf);
	
			switch(einwurf) {
				case 10: case 20: case 50: 
					if (einwurf > gebuehr){
						printf("Ungueltige Eingabe!\n");
					} else {
						gebuehr -= einwurf;
					} break;
				case 1:
				case 2:	if(einwurf * 100 > gebuehr)
								printf("Ungueltige Eingabe!\n");
							else 
								gebuehr -= einwurf * 100; 
							break;
				default: printf("Ungueltige Eingabe!\n");
			}
			printf("Restbetrag: %d\n", gebuehr);
	}

	printf("Gute Fahrt!\n");

	return 0;
}
