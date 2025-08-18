def solution(arr):
    sum_v = 0
    diff_pre = 100
    for n in arr:
        if n == 0:
            continue
        sum_v += n
        diff = abs(100-sum_v)
        if sum_v == 100:
            return sum_v
        elif diff_pre == diff:
            return sum_v
        elif diff_pre < diff:
            return sum_v - n
        else:
            diff_pre = diff
    return sum_v

arr = [int(input()) for _ in range(10)]
print(solution(arr))