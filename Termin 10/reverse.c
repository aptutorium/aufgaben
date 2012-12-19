#include <stdio.h>

int countchar(char word[]);
void reverse(char word[], int size);
void normal(char word[], int size);

int main()
{
	char word[10];
	int auswahl;

	printf("Bitte geben Sie ein Wort ein: ");
	scanf("%s", word);
	printf("In normaler (1) oder umgedrehter (2) Reihenfolge ausgeben? ");
	scanf("%d", &auswahl);

	switch (auswahl){
		case 1:
			printf("In normaler Reihenfolge: ");
			normal(word, countchar(word));
			break;
		case 2:
			printf("In umgedrehter Reihenfolge: ");
			reverse(word, countchar(word));
			break;
		default:
			printf("Ungültige Auswahl!");
	}

	return 0;
}

int countchar(char word[])
{
	int count = 0;

	while (word[count] != '\0') {
		count++;
	}

	return count;
}

void reverse(char word[], int size)
{
	int i;

	for (i = size -1; i >= 0; --i) {
		printf("%c", word[i]);
	}

}

void normal(char word[], int size)
{
	int i;
	for (i=0; i < size; ++i) {
		printf("%c", word[i]);
	}
}
