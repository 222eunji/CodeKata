N = int(input())
Pi = list(map(int, input().split()))
Pi.sort()
sum_v = 0
for i in range(N):
    sum_v += (Pi[i]*(N-i))
print(sum_v)