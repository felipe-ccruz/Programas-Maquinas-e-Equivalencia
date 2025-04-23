# Execução do programa.
---
### RECURSIVO
```
R def (se zero então ✓ senão sub; R; add; add; add)

Entrada: (R, ✓, 3)

(se zero então ✓ senão (sub; R; add; add; add), ✓, 3)
((sub; R; add; add; add), ✓, 3)
((R; add; add; add), ✓, 2)
((se zero então ✓ senão (sub; R; add; add; add); add; add; add), ✓, 2)
(((sub; R; add; add; add); add; add; add), ✓, 2)
(((R; add; add; add); add; add; add), ✓, 1)
(((se zero então ✓ senão (sub; R; add; add; add); add; add; add); add; add; add), ✓, 1)
((((sub; R; add; add; add); add; add; add); add; add; add), ✓, 1)
((((R; add; add; add); add; add; add); add; add; add), ✓, 0)
((((se zero então ✓ senão (sub; R; add; add; add); add; add; add); add; add; add); add; add; add), ✓, 0)
((((add; add); add; add; add); add; add; add), ✓, 1)
((((add); add; add; add); add; add; add), ✓, 2)
(((add; add; add); add; add; add), ✓, 3)
(((add; add); add; add; add), ✓, 4)
(((add); add; add; add), ✓, 5)
((add; add; add), ✓, 6)
((add; add), ✓, 7)
((add), ✓, 8)
( X , ✓, 9)
```

### MONOLÍTICO
```
R1: Se a==0 então vá para Rx, senão vá para R2
R2: Faça a_sub então vá para R3
R3: Faça b_add então vá para R4
R4: Faça b_add então vá para R5
R5: Faça b_add então vá para R1
```

### INTERATIVO
```
programa 
   ler(a);  
   b = 0; 
   enquanto (a != 0) faça 
        a = a - 1; 
        b = b + 1;
        b = b + 1;
        b = b + 1;  
   fim enquanto; 
   escrever(b); 
fim programa. 
```