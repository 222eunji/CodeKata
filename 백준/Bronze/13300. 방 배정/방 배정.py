N, K = map(int, input().split())
student = [[0] * 7 for _ in range(2)]

for _ in range(N):
    S, Y = map(int, input().split())
    student[S][Y] += 1
room_cnt = 0
for s in range(2):
    for y in range(1,7):
        if student[s][y] == 0:
            pass
        elif student[s][y] <= K:
            room_cnt += 1
        elif student[s][y] > K:
            room_cnt += (student[s][y] // K)
            if student[s][y] % K:
                room_cnt +=1

print(room_cnt)