N = int(input())

def sugar_delivery(N):
    max_5kg = N//5
    for i in range(max_5kg, -1, -1):
        cnt = i
        # 5의 배수를 빼고 남은 무게
        rest = N - 5 * cnt
        if rest % 3 == 0:
            cnt += rest//3
            return cnt

    return -1

print(sugar_delivery(N))

