#include<stdio.h>
#include <stdlib.h>
FILE *fp;
int main()
{
  double C1[] = {2.0+2.0,2.3};
  double VIN = 2.2+2.1;
  char text[] ="exemplary text";
  
  fp=fopen("text.txt","w");
  // long length = ftell(fp);
  // char buf[length];
  // fseek(fp, 0, SEEK_END);
  // fread(buf, 1, sizeof(buf), fp);
  // fclose(fp);
  printf(fopen("text.txt","r"));
  int al[]={1+3,2};
  printf(text);
  return 0;
}

