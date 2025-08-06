def square_area(arr):
    temp = [[0] *100 for _ in range(100)]
    sum_v = 0
    # 사각형 별로 넓이 구하기
    for i in range(4):
        x1, y1, x2, y2 = arr[i]
        sum_v += (x2-x1)*(y2-y1)
        # 넓이를 구한 영역 인덱스로 표시해주기
        for m in range(x1, x2):
            for n in range(y1, y2):
                temp[m][n] += 1
    # 중복 되는 영역 빼주기
    sub_v = 0
    for i in range(100):
        for j in range(100):
            if temp[i][j] > 1:
                sub_v += (temp[i][j] - 1)

    return sum_v - sub_v


# input
arr = [list(map(int, input().split())) for _ in range(4)]
print(square_area(arr))