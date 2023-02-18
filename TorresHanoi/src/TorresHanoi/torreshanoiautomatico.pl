hanoi(0, _, _, _, []).
hanoi(1, A, C, _, [Mover]) :-
    string_concat(A, ' ', A1),
    string_concat(A1, '', A2),
    string_concat(A2, C, Mover).
hanoi(N, A, C, B, Movimientos) :-
    N > 1,
    M is N - 1,
    hanoi(M, A, B, C, M1),
    hanoi(1, A, C, B, M2),
    hanoi(M, B, C, A, M3),
    append(M1, M2, M4),
    append(M4, M3, Movimientos).

