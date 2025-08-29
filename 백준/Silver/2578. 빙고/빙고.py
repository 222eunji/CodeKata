# 기존 구조 최대한 유지하면서 수정
bingo = [list(map(int, input().split())) for _ in range(5)]  # int로 변환 추가
call_num = []
for _ in range(5):
    call_num.extend(list(map(int, input().split())))  # 1차원으로 펼치기

count = 0

# 빙고 라인 체크 함수 (기존 로직과 분리)
def check_bingo_lines():
    lines = 0
    
    # 가로줄 체크
    for i in range(5):
        if sum(bingo[i]) == 0:
            lines += 1
    
    # 세로줄 체크  
    for j in range(5):
        if sum(bingo[i][j] for i in range(5)) == 0:
            lines += 1
    
    # 주대각선 체크
    if sum(bingo[i][i] for i in range(5)) == 0:
        lines += 1
    
    # 반대각선 체크
    if sum(bingo[i][4-i] for i in range(5)) == 0:
        lines += 1
    
    return lines

# 기존 반복문 구조 유지
for num in call_num:  # 2중 반복문을 1중으로 변경
    count += 1
    flag = False
    
    # 기존 탐색 로직 유지
    for x in range(5):
        for y in range(5):
            if bingo[x][y] == num:
                bingo[x][y] = 0
                flag = True
                break
        if flag:
            break
    
    # 기존 조건 유지 (12로 수정)
    if count >= 12:
        line = check_bingo_lines()  # 함수로 분리
        if line >= 3:
            print(count)
            break