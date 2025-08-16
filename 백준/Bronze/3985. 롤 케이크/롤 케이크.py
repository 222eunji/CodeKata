def solution(L, N, arr):
    cake = [0] * (L+1)
    max_expected = 0     # 많이 받을 거라고 생각한 방청객의 케이크 수
    max_expected_idx = 0 # 많이 받을 거라고 생각한 방청객의 번호
    max_actual = 0       # 실제로 많이 많이 받은 방청객의 케이크 수
    max_actual_idx = 0   # 실제로 많이 받은 방청객의 번호

    for i in range(1, N+1):
        p, k = arr[i][0], arr[i][1]
        # 가장 많은 케이크 조각을 받을 것으로 기대한 방청객
        if max_expected < k-p:
            max_expected = k-p
            max_expected_idx = i

        # 케이크 조각 카운트
        cake_i = 0
        for c in range(p, k+1):
            if cake[c] == 0:
                cake[c] = i
                cake_i += 1

        if max_actual < cake_i:
            max_actual = cake_i
            max_actual_idx = i

    print(max_expected_idx)
    print(max_actual_idx)


# 입출력
L = int(input())
N = int(input())
arr = [[0,0]]
for _ in range(N):
    Pi, Ki = map(int,input().split())
    arr.append([Pi, Ki])

solution(L, N, arr)
