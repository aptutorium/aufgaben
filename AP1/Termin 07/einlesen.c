#include <stdio.h>

int main( void )
{

  const unsigned int size = 5;
  int i;
  int input = 0;
  int values[size];

  // einlesen der zahlen
  for (i = 0; i < size; ++i)
  {
    printf("Bitte geben Sie eine Zahl ein: ");
    scanf("%d", &input);
    values[i] = input;
  }

  // ausgabe der zahlen
  printf("\nFolgende Zahlen wurden eingegeben:");
  printf("\n----------------------------------\n");
  for (i = 0; i < size; ++i)
  {
    printf("%d. Zahl: %d\n", i+1, values[i]);
  }
  printf("----------------------------------\n");

  return 0;
}
