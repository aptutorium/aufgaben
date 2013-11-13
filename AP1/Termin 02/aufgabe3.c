#include <stdio.h>

int main()
{
  int alter;
  float groesse;

  printf("Bitte geben Sie Ihr Alter ein: ");
  scanf("%i", &alter);

  printf("Bitte geben Sie Ihre Koerpergroesse ein: ");
  scanf("%f", &groesse);

  printf("Sie sind %i Jahre alt und %.2f m gross!\n", alter, groesse);

  return 0;
}
