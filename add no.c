//add and substraction and multiply and division...a,

#include <stdio.h>

int main()
{
    int a, b, c, d, e;
    float f;

    printf("Enter the 1st number: ");
    scanf("%d", &a);

    printf("Enter the 2nd number: ");
    scanf("%d", &b);

    c = a + b;
    d = a - b;
    e = a * b;
    f = (float)a / b;

    printf("sum is %d\n", c);
    printf("subtraction is %d\n", d);
    printf("multiply is %d\n", e);
    printf("division is %.2f\n", f);

    return 0;
}	
