```
section .data
    msgc db "Correto", 0ah
    
    msge db "Errado", 0ah


section .text
    global _start

_start:
    mov rax, 3
    mov rbx, 0

_R1:
    cmp rax, 0
    je _RX
    jmp _R2

_R2:
    sub rax, 1
    jmp _R3

_R3:
    add rbx, 1
    jmp _R4

_R4:
    add rbx, 1
    jmp _R5


_R5:
    add rbx, 1
    jmp _R1

_RX:
    cmp rbx, 9
    je _certo
    jmp _errado

_certo:
    mov rax, 1
    mov rdi, 1
    mov rsi, msgc
    mov rdx, 8
    jmp _finaliza

_errado:
    mov rax, 1
    mov rdi, 1
    mov rsi, msge
    mov rdx, 7
    jmp _finaliza

_finaliza:
    syscall
    mov rax, 60
    mov rdi, 0
    syscall
```