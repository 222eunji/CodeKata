def area(N, arr):
    paper = [[0] * 100 for _ in range(100)]

    for n in range(N):
        dx = arr[n][0]
        dy = arr[n][1]
        for i in range(dx, dx+10):
            for j in range(dy, dy+10):
                paper[i][j] += 1

    # 검은 영역 구하기
    area = 0
    for i in range(100):
        for j in range(100):
            if paper[i][j] > 0:
                area += 1
    return area


# 입출력
N = int(input())
arr = [list(map(int, input().split())) for _ in range(N)]
print(area(N, arr))