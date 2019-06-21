#include <stdio.h>
int main() {
	
  int n,fin=0,num;
  scanf("%d",&n);
num=n;
  while(n!=0)
  {
    int d=n%10;
    int sum=1;
    for(int i=1;i<=d;i++)
    {
      sum=sum*i;
    }
    fin=sum+fin;
 n=n/10;
  }
 
  if(num==fin)
  printf("Yes");
  else
  printf("No");
	return 0;
}