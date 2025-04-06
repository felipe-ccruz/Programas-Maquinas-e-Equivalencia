# Execução do programa.
---
### RECURSIVO
- Triplica R
```
R def (se zero então ✓ senão sub; R; add; add; add)

Entrada: (R, ✓, 3)

(se zero então ✓ senão (sub; R; add; add; add), ✓, 3)
```
### MONOLÍTICO

- Triplica R
R1: ler (n) vá para R2
R2: Faça k = n*3
R3: Se n==0 então vá para Rx, senão vá para R4
R4: Faça n = n-1 então vá para R5
R5: Faça n = n+1 então vá para R6
R6: Faça n = n+1 então vá para R7
R7: Faça n = n+1 então vá para R8
R8: Faça n == k então vá para Rx, senão vá para R3