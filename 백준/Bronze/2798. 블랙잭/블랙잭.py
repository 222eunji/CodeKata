def solution(N, M, cards):
    diff = 1000000
    ans = -1
    for i in range(N-2):
        sum_v = 0
        for j in range(i+1, N-1):
            for k in range(j+1, N):
                sum_v = cards[i] + cards[j] + cards[k]
                if diff > M-sum_v >= 0:
                    diff = M-sum_v
                    ans = sum_v
    return ans


# 입출력
N, M = map(int, input().split())
cards = list(map(int, input().split()))
print(solution(N, M, cards))