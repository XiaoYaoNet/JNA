#include <stdio.h>
extern "C" __declspec(dllexport) void PT(char* a, float *b);

void PT(char* a, float *b){
	printf("%s , %f",a,*b);
}