#include <stdio.h>

int main(void)
{
  double summe, eingabe = 1;

  while(eingabe != 0){
    printf("Bitte geben Sie eine Zahl ein: ");
    scanf("%lf", &eingabe);
    summe += eingabe;
  }

  printf("Die Summe beträgt: %.2lf", summe);

  return 0;
}
