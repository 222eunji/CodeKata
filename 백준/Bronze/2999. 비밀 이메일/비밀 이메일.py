# 입력 받기
s = input()

n = len(s)
# R, C 값 찾기
R = C = 0
for i in range(1, n):
    if n%i == 0:
        r = i
        c = n // i
        if r > c:
            break
        else:
            R = r
            C = c

# 문자 입력 받기
lst = [[0] * R for _ in range(C)]
i = 0
for c in range(C):
    for r in range(R):
        lst[c][r] = s[i]
        i += 1

# 복호화
result = list(zip(*lst))
ans = ''
for i in range(R):
    ans += ''.join(result[i])
print(ans)