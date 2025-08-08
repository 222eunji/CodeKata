N,M,L = map(int, input().split())

def pass_ball(N, M, L):
    arr = [0] * N
    now = 0
    cnt = 0
    while True:
        arr[now] += 1
        cnt += 1
        # M번 받으면 종료
        if arr[now] == M:
            return cnt-1
        # 홀수번 받으면 오른쪽 pass
        if arr[now] % 2 == 1:
            now += L
            if now >= N:
                now -= N
        # 짝수번 받으면 오른쪽 pass
        else:
            now -= L
            if now < 0:
                now += N


print(pass_ball(N, M, L))