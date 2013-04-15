#include <stdio.h>

void einlesen(int array[], int groesse);
void ausgabe(int array[], int groesse);
int max(int array[], int groesse);
int min(int array[], int groesse);
void sortieren(int array[], int groesse);

int main()
{	
	const int groesse = 5;
	int array[groesse];
	
	printf("Bitte geben Sie 5 Zahlen ein! \n");
	einlesen(array, groesse);

	printf("\nGroesste Zahl: %d \n", max(array, groesse));
    printf("kleinste Zahl: %d \n", min(array, groesse));
	
	printf("\nUnsortiertes Array: \n");
	ausgabe(array, groesse);
	
	printf("\nSortiertes Array: \n");
	sortieren(array, groesse);
	ausgabe(array, groesse);
	
	return 0;
}

void einlesen(int array[], int groesse)
{
	int i;
	
	for (i=0; i < groesse; i++) {
		printf("%d. Zahl eingeben: ", i+1);
		scanf("%d", array[i]);
	}
}

void ausgabe(int array[], int groesse)
{
	int i;
	
	for (i=0; i < groesse; i++) {
		printf("%d ", array[i]);
	}
	printf("\n");
}

int max(int array[], int groesse) 
{
	int max = array[0], i;

	for (i = 1; i < groesse; ++i) {
		if (max < array[i])
			max = array[i];
	}
	return max;
}

int min(int array[], int groesse) 
{
	int min = array[0], i;
	for (i = 1; i < groesse; ++i) {
		if (min > array[i])
			min = array[i];
	}	
	return min;
}

void sortieren(int array[], int groesse)
{
	int i, j;
	
    for (i = 0; i < groesse; i++) {
        for (j = 0; j < groesse - 1; j++) {
        	if (array[j] > array[j+1]) {
        		int tmp = array[j];
        		array[j] = array[j+1];
        		array[j+1] = tmp;
			}
    	}
	}
}