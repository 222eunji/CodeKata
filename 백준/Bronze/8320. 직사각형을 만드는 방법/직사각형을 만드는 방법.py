def solution(n):
    if n == 1:
        return 1

    cnt = 0
    for i in range(1, n//2 + 1):
        for j in range(i, n//i + 1):
            if i*j <= n:
                cnt += 1
    return cnt

N = int(input())
print(solution(N))