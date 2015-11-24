#include <stdio.h>

int addDigits(int num)
{
  int sum;
  
  for(;;)
  {
    sum = 0;
    while(num > 0)
    {
	sum += num % 10;
	num /= 10;
    }

    if(sum > 9) num = sum;
    else break;
  }
  return sum;
}

int main()
{
  printf("%d", addDigits(38));
  printf("%d", addDigits(39));
  printf("%d", addDigits(40));
  printf("%d", addDigits(100));
  printf("%d", addDigits(99));
  printf("%d", addDigits(0));
  printf("%d", addDigits(1));
  printf("%d", addDigits(222));
  printf("%d", addDigits(444));
  return 0;
}
