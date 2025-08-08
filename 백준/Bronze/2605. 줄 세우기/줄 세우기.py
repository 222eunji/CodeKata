N = int(input())
arr = list(map(int, input().split()))

position = []
for i in range(N):
    p = arr[i]
    position.insert(i-p, i+1)

print(*position)