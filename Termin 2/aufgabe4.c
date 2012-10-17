#include <stdio.h>

int main()
{
	int alter;
	int verbleibend;

	printf("Bitte geben Sie Ihr Alter ein: ");
	scanf("%i", &alter);

  if (alter >= 18)
  {
    printf("Die Person ist mit %i Jahren bereits volljaehrig.\n", alter);
  }
  else {
  	verbleibend = 18 - alter;
    printf("Die Person ist mit %i Jahren noch nicht volljaehrig! Es fehlen noch %i Jahre.\n", alter, verbleibend);
  }

	return 0;
}
