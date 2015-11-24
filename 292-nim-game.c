#include <stdio.h>
#include <stdbool.h>

bool canWinNim(int n)
{
    if(n < 0) return true;
    return (n % 4 > 0) && (n % 4 <= 3);
}

int main()
{
  printf("%d", canWinNim(0));
  printf("%d", canWinNim(1));
  printf("%d", canWinNim(2));
  printf("%d", canWinNim(3));
  printf("%d", canWinNim(4));
  printf("%d", canWinNim(5));
  printf("%d", canWinNim(6));
  printf("%d", canWinNim(7));
  printf("%d", canWinNim(8));
  printf("%d", canWinNim(9));
  printf("%d", canWinNim(10));
  printf("%d", canWinNim(-5));
  printf("%d", -5 % 4);
  return 0;
}
