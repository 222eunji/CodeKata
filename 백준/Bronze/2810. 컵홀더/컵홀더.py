def solution(N, seats):
    count_L = 0
    for seat in seats:
        if seat == 'L':
            count_L += 1
    possible = N + 1 - (count_L // 2)
    if N > possible:
        return possible
    else:
        return N


# 입출력
N = int(input())
seats = input()
print(solution(N, seats))