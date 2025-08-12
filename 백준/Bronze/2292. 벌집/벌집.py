def solution(n):
    layer, end = 1, 1
    while end < n:
        end += 6*layer
        layer += 1

    return layer


N = int(input())
print(solution(N))