#include <stdio.h>

int main()
{
	int alter;

	printf("Bitte geben Sie Ihr Alter ein: ");
	scanf("%i", &alter);

  if (alter >= 18)
  {
    printf("Die Person ist mit %i Jahren bereits volljaehrig.\n", alter);
  }
  else {
    printf("Die Person ist mit %i Jahren noch nicht volljaehrig!\n", alter);
  }

	return 0;
}
