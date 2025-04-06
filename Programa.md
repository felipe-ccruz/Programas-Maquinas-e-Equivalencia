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
R1: ler (a) vá para R2
R2: Se a==0 então vá para Rx, senão vá para R3
R3: Faça a_sub então vá para R4
R4: Faça b_add então vá para R5
R5: Faça b_add então vá para R6
R6: Faça b_add então vá para R2
