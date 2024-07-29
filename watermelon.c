#include "stdio.h"

int main()
{
    int x;
    scanf("%d", &x);
    printf((x > 2 && x % 2 == 0) ? "YES" : "NO");
    return 0;
}

