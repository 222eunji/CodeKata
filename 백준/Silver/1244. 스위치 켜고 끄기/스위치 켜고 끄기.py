switch_count = int(input())
switch_status = list(map(int, input().split()))
student_count = int(input())
student_arr = [list(map(int, input().split())) for _ in range(student_count)]

for s, n in student_arr:
    idx = n-1
    if s == 1:
        # n의 배수 스위치 바꾸기
        while idx < switch_count:
            switch_status[idx] = 1 - switch_status[idx]
            idx += n
    else:
        pass
        # 대칭으로 스위치 바꾸기 (항상 홀수)
        switch_status[idx] = 1 - switch_status[idx]
        for j in range(1, switch_count//2):
            if (0 <= idx-j < switch_count) and (0 <= idx+j < switch_count) and (switch_status[idx-j] == switch_status[idx+j]):
                switch_status[idx-j] = 1 - switch_status[idx-j]
                switch_status[idx+j] = 1 - switch_status[idx+j]
            else:
                break


for i in range(switch_count):
    if ((i+1) % 20) == 0:
        print(switch_status[i])
    else:
        print(switch_status[i], end=" ")
