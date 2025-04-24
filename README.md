# Execução do programa.
---
### RECURSIVO
```
               R1             R2       R3   R4  R5 
               |               |       |    |    |   
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
- Máquina de Traços:
```
Entrada = 3

A -> sub
B -> add
C -> add
D -> add

(1(_)),
(2(A)),
(1(A)),
(2(AA)),
(1(AA)),
(2(AAA)),
(1(AAA)),
(3(AAAB)),
(4(AAABC)),
(5(AAABCD)),
(3(AAABCDB)),
(4(AAABCDBC)),
(5(AAABCDBDC)),
(3(AAABCDBDCB)),
(4(AAABCDBDCBC)),
(5(AAABCDBDCBCD)),
(X(AAABCDBDCBCD)),
```

### MONOLÍTICO
```
R1: Se a==0 então vá para Rx, senão vá para R2
R2: Faça a_sub então vá para R3
R3: Faça b_add então vá para R4
R4: Faça b_add então vá para R5
R5: Faça b_add então vá para R1
```
- Máquina de Traços:
```
Entrada = 3

A -> sub
B -> add
C -> add
D -> add

(1(_)),
(2(A)),
(3(AB)),
(4(ABC)),
(5(ABCD)),
(1(ABCD)),
(2(ABCDA)),
(3(ABCDAB)),
(4(ABCDABC)),
(5(ABCDABCD)),
(1(ABCDABCD)),
(2(ABCDABCDA)),
(3(ABCDABCDAB)),
(4(ABCDABCDABC)),
(5(ABCDABCDABCD)),
(1(ABCDABCDABCD)),
(X(ABCDABCDABCD))
```

### INTERATIVO
```
programa 
   ler(a);  
   b = 0; 
   enquanto (a != 0) faça //R1
        a = a - 1; //R2
        b = b + 1; //R3
        b = b + 1; //R4
        b = b + 1; //R5
   fim enquanto; 
   escrever(b); 
fim programa. 
```

- Máquina de Traços:
```
Entrada = 3

A -> sub
B -> add
C -> add
D -> add

(1(_)),
(2(A)),
(3(AB)),
(4(ABC)),
(5(ABCD)),
(1(ABCD)),
(2(ABCDA)),
(3(ABCDAB)),
(4(ABCDABC)),
(5(ABCDABCD)),
(1(ABCDABCD)),
(2(ABCDABCDA)),
(3(ABCDABCDAB)),
(4(ABCDABCDABC)),
(5(ABCDABCDABCD)),
(1(ABCDABCDABCD)),
(X(ABCDABCDABCD))
```