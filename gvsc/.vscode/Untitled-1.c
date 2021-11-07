#include <stdio.h>
#include <stdlib.h>
int main()
{
    int a, b;
    printf("Nhap 1 so a bat ky:");
    scanf("%d",&a);
    b=a&1<<2;
    printf("%d\n",b);
    if (b!=0)
        printf("Bit so 3 so da cho la 1");
    else
        printf("Bit so 3 so da cho la 0");
    return 0;
}