#include <stdio.h>
int main() {
	int n,arm,num;
  scanf("%d",&n);
  num=n;
  while(n!=0)
  {
    int d=n%10;
    arm=d*d*d+arm;
  
    n=n/10;

  }
  if(num==arm)
printf("Armstrong Number");
    else
      printf("Not an Armstrong Number");
    return 0;
}