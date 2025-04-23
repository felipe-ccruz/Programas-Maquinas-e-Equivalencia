```
#include <stdio.h>

int main() {

    int n = triplica(3);
    printf("%d", n);

}

int triplica(int n) {
    int a = n;
    int b = 0;

    R1:
    if (a == 0) goto RX;

    R2:
    a--;
    goto R3;

    R3:
    b++;
    goto R4;

    R4:
    b++;
    goto R5;

    R5:
    b++;
    goto R1;

    RX:
    return b;
}
``` 