#include <stdio.h>
#include <conio.h>
void main()
{
    int x=10,y;
    y=++x;
    printf("%d %d",x,y);
    y=x++;
    printf("\n%d %d",x,y);
    getch();
}

// O/p: 11 11
//      12 11