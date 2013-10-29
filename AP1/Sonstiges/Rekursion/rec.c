#include <stdio.h>

int fac(int x);
int fib(int x);
int pot(int a, int b);

int main(int argc, char const *argv[])
{
	printf("fac(4): %d\n", fac(4));
	printf("fib(24): %d\n", fib(24));
	printf("pot(4, 2): %d\n", pot(2, 6));
	return 0;
}

int fac(int x) {
	return x < 1 ? 1 : x * fac(x-1); 
}

int fib(int x) {
	if(x == 0) return 0;
	return x < 2 ? 1 : fib(x-1) + fib(x-2); 
}

int pot(int a, int b) {
	return b == 0 ? 1 : a * pot(a, b-1); 
}