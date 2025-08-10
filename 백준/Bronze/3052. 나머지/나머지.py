rest = []
for _ in range(10):
    N = int(input())
    if N % 42 not in rest:
        rest.append(N % 42)

print(len(rest))